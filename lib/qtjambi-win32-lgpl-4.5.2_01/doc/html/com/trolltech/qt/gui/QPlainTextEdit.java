package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPlainTextEdit class provides a widget that is used to edit and display plain text. <ul><li> {@link <a href="#introduction-and-concepts">Introduction and Concepts</a>}</li><li> {@link <a href="#using-qplaintextedit-as-a-display-widget">Using QPlainTextEdit as a Display Widget</a>}</li> <ul><li> {@link <a href="#read-only-key-bindings">Read-only Key Bindings</a>}</li></ul><li> {@link <a href="#using-qplaintextedit-as-an-editor">Using QPlainTextEdit as an Editor</a>}</li> <ul><li> {@link <a href="#syntax-highlighting">Syntax Highlighting</a>}</li><li> {@link <a href="#editing-key-bindings">Editing Key Bindings</a>}</li></ul><li> {@link <a href="#differences-to-qtextedit">Differences to QTextEdit</a>}</li></ul><a name="introduction-and-concepts"><h2>Introduction and Concepts</h2> QPlainTextEdit is an advanced viewer/editor supporting plain text. It is optimized to handle large documents and to respond quickly to user input. <p>QPlainText uses very much the same technology and concepts as {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, but is optimized for plain text handling. <p>QPlainTextEdit works on paragraphs and characters. A paragraph is a formatted string which is word-wrapped to fit into the width of the widget. By default when reading plain text, one newline signifies a paragraph. A document consists of zero or more paragraphs. The words in the paragraph are aligned in accordance with the paragraph's alignment. Paragraphs are separated by hard line breaks. Each character within a paragraph has its own attributes, for example, font and color. <p>The shape of the mouse cursor on a QPlainTextEdit is {@link com.trolltech.qt.core.Qt.CursorShape Qt::IBeamCursor } by default. It can be changed through the {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}'s cursor property.<a name="using-qplaintextedit-as-a-display-widget"><h2>Using QPlainTextEdit as a Display Widget</h2> The text is set or replaced using {@link com.trolltech.qt.gui.QPlainTextEdit#setPlainText(java.lang.String) setPlainText()} which deletes any existing text and replaces it with the text passed in the {@link com.trolltech.qt.gui.QPlainTextEdit#setPlainText(java.lang.String) setPlainText()} call. <p>Text itself can be inserted using the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} class or using the convenience functins {@link com.trolltech.qt.gui.QPlainTextEdit#insertPlainText(java.lang.String) insertPlainText()}, {@link com.trolltech.qt.gui.QPlainTextEdit#appendPlainText(java.lang.String) appendPlainText()} or {@link com.trolltech.qt.gui.QPlainTextEdit#paste() paste()}. <p>By default the text edit wraps words at whitespace to fit within the text edit widget. The {@link com.trolltech.qt.gui.QPlainTextEdit#setLineWrapMode(com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode) setLineWrapMode()} function is used to specify the kind of line wrap you want, {@link com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode WidgetWidth } or {@link com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode NoWrap } if you don't want any wrapping. If you use word wrap to the widget's width {@link com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode WidgetWidth }, you can specify whether to break on whitespace or anywhere with {@link com.trolltech.qt.gui.QPlainTextEdit#setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWordWrapMode()}. <p>The {@link com.trolltech.qt.gui.QPlainTextEdit#find(java.lang.String, com.trolltech.qt.gui.QTextDocument.FindFlag[]) find()} function can be used to find and select a given string within the text. <p>If you want to limit the total number of paragraphs in a QPlainTextEdit, as it is for example useful in a log viewer, then you can use the {@link QPlainTextEdit#maximumBlockCount() maximumBlockCount} property. The combination of {@link com.trolltech.qt.gui.QPlainTextEdit#setMaximumBlockCount(int) setMaximumBlockCount()} and {@link com.trolltech.qt.gui.QPlainTextEdit#appendPlainText(java.lang.String) appendPlainText()} turns QPlainTextEdit into an efficient viewer for log text. The scrolling can be reduced with the {@link com.trolltech.qt.gui.QPlainTextEdit#centerOnScroll() centerOnScroll()} property, making the log viewer even faster. Text can be formatted in a limited way, either using a syntax highlighter (see below), or by appending html-formatted text with {@link com.trolltech.qt.gui.QPlainTextEdit#appendHtml(java.lang.String) appendHtml()}. While QPlainTextEdit does not support complex rich text rendering with tables and floats, it does support limited paragraph-based formatting that you may need in a log viewer.<a name="read-only-key-bindings"><h3>Read-only Key Bindings</h3> When QPlainTextEdit is used read-only the key bindings are limited to navigation, and text may only be selected with the mouse: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Keypresses</center></th><th><center> Action</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ArrowType Qt::UpArrow }</td><td> Moves one line up.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ArrowType Qt::DownArrow }</td><td> Moves one line down.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ArrowType Qt::LeftArrow }</td><td> Moves one character to the left.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ArrowType Qt::RightArrow }</td><td> Moves one character to the right.</td></tr><tr valign="top" class="even"><td> PageUp</td><td> Moves one (viewport) page up.</td></tr><tr valign="top" class="odd"><td> PageDown</td><td> Moves one (viewport) page down.</td></tr><tr valign="top" class="even"><td> Home</td><td> Moves to the beginning of the text.</td></tr><tr valign="top" class="odd"><td> End</td><td> Moves to the end of the text.</td></tr><tr valign="top" class="even"><td> Alt+Wheel</td><td> Scrolls the page horizontally (the Wheel is the mouse wheel).</td></tr><tr valign="top" class="odd"><td> Ctrl+Wheel</td><td> Zooms the text.</td></tr><tr valign="top" class="even"><td> Ctrl+A</td><td> Selects all text.</td></tr></table><a name="using-qplaintextedit-as-an-editor"><h2>Using QPlainTextEdit as an Editor</h2> All the information about using QPlainTextEdit as a display widget also applies here. <p>Selection of text is handled by the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} class, which provides functionality for creating selections, retrieving the text contents or deleting selections. You can retrieve the object that corresponds with the user-visible cursor using the {@link com.trolltech.qt.gui.QPlainTextEdit#textCursor() textCursor()} method. If you want to set a selection in QPlainTextEdit just create one on a {@link com.trolltech.qt.gui.QTextCursor QTextCursor} object and then make that cursor the visible cursor using setCursor(). The selection can be copied to the clipboard with {@link com.trolltech.qt.gui.QPlainTextEdit#copy() copy()}, or cut to the clipboard with {@link com.trolltech.qt.gui.QPlainTextEdit#cut() cut()}. The entire text can be selected using {@link com.trolltech.qt.gui.QPlainTextEdit#selectAll() selectAll()}. <p>QPlainTextEdit holds a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} object which can be retrieved using the {@link com.trolltech.qt.gui.QPlainTextEdit#document() document()} method. You can also set your own document object using {@link com.trolltech.qt.gui.QPlainTextEdit#setDocument(com.trolltech.qt.gui.QTextDocument) setDocument()}. {@link com.trolltech.qt.gui.QTextDocument QTextDocument} emits a {@link com.trolltech.qt.gui.QPlainTextEdit#textChanged textChanged() } signal if the text changes and it also provides a isModified() function which will return true if the text has been modified since it was either loaded or since the last call to setModified with false as argument. In addition it provides methods for undo and redo.<a name="syntax-highlighting"><h3>Syntax Highlighting</h3> Just like {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, QPlainTextEdit works together with {@link com.trolltech.qt.gui.QSyntaxHighlighter QSyntaxHighlighter}.<a name="editing-key-bindings"><h3>Editing Key Bindings</h3> The list of key bindings which are implemented for editing: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Keypresses</center></th><th><center> Action</center></th></tr></thead><tr valign="top" class="even"><td> Backspace</td><td> Deletes the character to the left of the cursor.</td></tr><tr valign="top" class="odd"><td> Delete</td><td> Deletes the character to the right of the cursor.</td></tr><tr valign="top" class="even"><td> Ctrl+C</td><td> Copy the selected text to the clipboard.</td></tr><tr valign="top" class="odd"><td> Ctrl+Insert</td><td> Copy the selected text to the clipboard.</td></tr><tr valign="top" class="even"><td> Ctrl+K</td><td> Deletes to the end of the line.</td></tr><tr valign="top" class="odd"><td> Ctrl+V</td><td> Pastes the clipboard text into text edit.</td></tr><tr valign="top" class="even"><td> Shift+Insert</td><td> Pastes the clipboard text into text edit.</td></tr><tr valign="top" class="odd"><td> Ctrl+X</td><td> Deletes the selected text and copies it to the clipboard.</td></tr><tr valign="top" class="even"><td> Shift+Delete</td><td> Deletes the selected text and copies it to the clipboard.</td></tr><tr valign="top" class="odd"><td> Ctrl+Z</td><td> Undoes the last operation.</td></tr><tr valign="top" class="even"><td> Ctrl+Y</td><td> Redoes the last operation.</td></tr><tr valign="top" class="odd"><td> LeftArrow</td><td> Moves the cursor one character to the left.</td></tr><tr valign="top" class="even"><td> Ctrl+LeftArrow</td><td> Moves the cursor one word to the left.</td></tr><tr valign="top" class="odd"><td> RightArrow</td><td> Moves the cursor one character to the right.</td></tr><tr valign="top" class="even"><td> Ctrl+RightArrow</td><td> Moves the cursor one word to the right.</td></tr><tr valign="top" class="odd"><td> UpArrow</td><td> Moves the cursor one line up.</td></tr><tr valign="top" class="even"><td> Ctrl+UpArrow</td><td> Moves the cursor one word up.</td></tr><tr valign="top" class="odd"><td> DownArrow</td><td> Moves the cursor one line down.</td></tr><tr valign="top" class="even"><td> Ctrl+Down Arrow</td><td> Moves the cursor one word down.</td></tr><tr valign="top" class="odd"><td> PageUp</td><td> Moves the cursor one page up.</td></tr><tr valign="top" class="even"><td> PageDown</td><td> Moves the cursor one page down.</td></tr><tr valign="top" class="odd"><td> Home</td><td> Moves the cursor to the beginning of the line.</td></tr><tr valign="top" class="even"><td> Ctrl+Home</td><td> Moves the cursor to the beginning of the text.</td></tr><tr valign="top" class="odd"><td> End</td><td> Moves the cursor to the end of the line.</td></tr><tr valign="top" class="even"><td> Ctrl+End</td><td> Moves the cursor to the end of the text.</td></tr><tr valign="top" class="odd"><td> Alt+Wheel</td><td> Scrolls the page horizontally (the Wheel is the mouse wheel).</td></tr><tr valign="top" class="even"><td> Ctrl+Wheel</td><td> Zooms the text.</td></tr></table> To select (mark) text hold down the Shift key whilst pressing one of the movement keystrokes, for example, Shift+Right Arrow will select the character to the right, and Shift+Ctrl+Right Arrow will select the word to the right, etc.<a name="differences-to-qtextedit"><h2>Differences to QTextEdit</h2> QPlainTextEdit is a thin class, implemented by using most of the technology that is behind {@link com.trolltech.qt.gui.QTextEdit QTextEdit} and {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. Its performance benefits over {@link com.trolltech.qt.gui.QTextEdit QTextEdit} stem mostly from using a different and simplified text layout called {@link com.trolltech.qt.gui.QPlainTextDocumentLayout QPlainTextDocumentLayout} on the text document (see {@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) QTextDocument::setDocumentLayout()}). The plain text document layout does not support tables nor embedded frames, and replaces a pixel-exact height calculation with a line-by-line respectively paragraph-by-paragraph scrolling approach. This makes it possible to handle significantly larger documents, and still resize the editor with line wrap enabled in real time. It also makes for a fast log viewer (see {@link com.trolltech.qt.gui.QPlainTextEdit#setMaximumBlockCount(int) setMaximumBlockCount()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument QTextDocument}, {@link com.trolltech.qt.gui.QTextCursor QTextCursor}, {@link <a href="../qtjambi-application.html">Application Example</a>}, {@link <a href="../qtjambi-syntaxhighlighter.html">Syntax Highlighter Example</a>}, and {@link <a href="../richtext.html">Rich Text Processing</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPlainTextEdit extends com.trolltech.qt.gui.QAbstractScrollArea
{

    private Object __rcDocument = null;
    public enum LineWrapMode implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoWrap(0),
/**

*/

        WidgetWidth(1);

        LineWrapMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPlainTextEdit$LineWrapMode constant with the specified <tt>int</tt>.</brief>
*/

        public static LineWrapMode resolve(int value) {
            return (LineWrapMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoWrap;
            case 1: return WidgetWidth;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: newBlockCount)&gt;:<p> This signal is emitted whenever the block count changes. The new block count is passed in <tt>newBlockCount</tt>.
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: yes)&gt;:<p> This signal is emitted when text is selected or de-selected in the text edit. <p>When text is selected this signal will be emitted with <tt>yes</tt> set to true. If no text has been selected or if the selected text is de-selected this signal is emitted with <tt>yes</tt> set to false. <p>If <tt>yes</tt> is true then {@link com.trolltech.qt.gui.QPlainTextEdit#copy() copy()} can be used to copy the selection to the clipboard. If <tt>yes</tt> is false then {@link com.trolltech.qt.gui.QPlainTextEdit#copy() copy()} does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#selectionChanged selectionChanged() }. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: changed)&gt;:<p> This signal is emitted whenever the content of the document changes in a way that affects the modification state. If <tt>changed</tt> is true, the document has been modified; otherwise it is false. <p>For example, calling setModified(false) on a document and then inserting text causes the signal to get emitted. If you undo that operation, causing the document to return to its original unmodified state, the signal will get emitted again.
*/

    public final Signal1<java.lang.Boolean> modificationChanged = new Signal1<java.lang.Boolean>();

    private final void modificationChanged(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_modificationChanged_boolean(nativeId(), arg__1);
    }
    native void __qt_modificationChanged_boolean(long __this__nativeId, boolean arg__1);
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
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#copyAvailable copyAvailable() }. <br></DD></DT>
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
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QRect(named: rect), java.lang.Integer(named: dy)&gt;:<p> This signal is emitted when the text document needs an update of the specified <tt>rect</tt>. If the text is scrolled, <tt>rect</tt> will cover the entire viewport area. If the text is scrolled vertically, <tt>dy</tt> carries the amount of pixels the viewport was scrolled. <p>The purpose of the signal is to support extra widgets in plain text edit subclasses that e.g. show line numbers, breakpoints, or other extra information.
*/

    public final Signal2<com.trolltech.qt.core.QRect, java.lang.Integer> updateRequest = new Signal2<com.trolltech.qt.core.QRect, java.lang.Integer>();

    private final void updateRequest(com.trolltech.qt.core.QRect rect, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateRequest_QRect_int(nativeId(), rect == null ? 0 : rect.nativeId(), dy);
    }
    native void __qt_updateRequest_QRect_int(long __this__nativeId, long rect, int dy);


/**
Constructs an empty QPlainTextEdit with parent <tt>parent</tt>.
*/

    public QPlainTextEdit() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty QPlainTextEdit with parent <tt>parent</tt>.
*/

    public QPlainTextEdit(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPlainTextEdit_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPlainTextEdit_QWidget(long parent);


/**
Constructs a QPlainTextEdit with parent <tt>parent</tt>. The text edit will display the plain text <tt>text</tt>.
*/

    public QPlainTextEdit(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QPlainTextEdit with parent <tt>parent</tt>. The text edit will display the plain text <tt>text</tt>.
*/

    public QPlainTextEdit(java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPlainTextEdit_String_QWidget(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPlainTextEdit_String_QWidget(java.lang.String text, long parent);

/**
Appends a new paragraph with <tt>html</tt> to the end of the text edit. <p>{@link com.trolltech.qt.gui.QPlainTextEdit#appendPlainText(java.lang.String) appendPlainText()}
*/

    public final void appendHtml(java.lang.String html)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendHtml_String(nativeId(), html);
    }
    native void __qt_appendHtml_String(long __this__nativeId, java.lang.String html);

/**
Appends a new paragraph with <tt>text</tt> to the end of the text edit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#appendHtml(java.lang.String) appendHtml()}. <br></DD></DT>
*/

    public final void appendPlainText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendPlainText_String(nativeId(), text);
    }
    native void __qt_appendPlainText_String(long __this__nativeId, java.lang.String text);

/**
This property holds whether the palette background is visible outside the document area. If set to true, the plain text edit paints the palette background on the viewport area not covered by the text document. Otherwise, if set to false, it won't. The feature makes it possible for the user to visually distinguish between the area of the document, painted with the base color of the palette, and the empty area not covered by any document. <p>The default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="backgroundVisible")
    @QtBlockedSlot
    public final boolean backgroundVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_backgroundVisible(long __this__nativeId);

/**
Returns the bounding rectangle of the text <tt>block</tt> in content coordinates. Translate the rectangle with the {@link com.trolltech.qt.gui.QPlainTextEdit#contentOffset() contentOffset()} to get visual coordinates on the viewport. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#firstVisibleBlock() firstVisibleBlock()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#blockBoundingRect(com.trolltech.qt.gui.QTextBlock) blockBoundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRectF blockBoundingGeometry(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockBoundingGeometry_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_blockBoundingGeometry_QTextBlock(long __this__nativeId, long block);

/**
Returns the bounding rectangle of the text <tt>block</tt> in the block's own coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#blockBoundingGeometry(com.trolltech.qt.gui.QTextBlock) blockBoundingGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRectF blockBoundingRect(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockBoundingRect_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_blockBoundingRect_QTextBlock(long __this__nativeId, long block);

/**
This property holds the number of text blocks in the document.  By default, in an empty document, this property contains a value of 1.
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
Scrolls the document in order to center the cursor vertically. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#ensureCursorVisible() ensureCursorVisible()}, and {@link QPlainTextEdit#centerOnScroll() centerOnScroll}. <br></DD></DT>
*/

    public final void centerCursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_centerCursor(nativeId());
    }
    native void __qt_centerCursor(long __this__nativeId);

/**
This property holds whether the cursor should be centered on screen. If set to true, the plain text edit scrolls the document vertically to make the cursor visible at the center of the viewport. This also allows the text edit to scroll below the end of the document. Otherwise, if set to false, the plain text edit scrolls the smallest amount possible to ensure the cursor is visible. The same algorithm is applied to any new line appended through {@link com.trolltech.qt.gui.QPlainTextEdit#appendPlainText(java.lang.String) appendPlainText()}. <p>The default is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#centerCursor() centerCursor()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#ensureCursorVisible() ensureCursorVisible()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="centerOnScroll")
    @QtBlockedSlot
    public final boolean centerOnScroll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_centerOnScroll(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_centerOnScroll(long __this__nativeId);

/**
Deletes all the text in the text edit. <p>Note that the undo/redo history is cleared by this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#cut() cut()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#setPlainText(java.lang.String) setPlainText()}. <br></DD></DT>
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Returns the content's origin in viewport coordinates. <p>The origin of the content of a plain text edit is always the top left corner of the first visible text block. The content offset is different from (0,0) when the text has been scrolled horizontally, or when the first visible block has been scrolled partially off the screen, i.e. the visible text does not start with the first line of the first visible block, or when the first visible block is the very first block and the editor displays a margin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#firstVisibleBlock() firstVisibleBlock()}, {@link com.trolltech.qt.gui.QAbstractScrollArea#horizontalScrollBar() horizontalScrollBar()}, and {@link com.trolltech.qt.gui.QAbstractScrollArea#verticalScrollBar() verticalScrollBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPointF contentOffset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentOffset(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_contentOffset(long __this__nativeId);

/**
Copies any selected text to the clipboard. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#copyAvailable copyAvailable() }. <br></DD></DT>
*/

    public final void copy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_copy(nativeId());
    }
    native void __qt_copy(long __this__nativeId);

/**
This function creates the standard context menu which is shown when the user clicks on the line edit with the right mouse button. It is called from the default contextMenuEvent() handler. The popup menu's ownership is transferred to the caller.
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
Returns the char format that is used when inserting new text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#setCurrentCharFormat(com.trolltech.qt.gui.QTextCharFormat) setCurrentCharFormat()}. <br></DD></DT>
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
Copies the selected text to the clipboard and deletes it from the text edit. <p>If there is no selected text nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#copy() copy()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#paste() paste()}. <br></DD></DT>
*/

    public final void cut()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cut(nativeId());
    }
    native void __qt_cut(long __this__nativeId);

/**
Returns a pointer to the underlying document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#setDocument(com.trolltech.qt.gui.QTextDocument) setDocument()}. <br></DD></DT>
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
This property holds the title of the document parsed from the text.  By default, this property contains an empty string.
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
Ensures that the cursor is visible by scrolling the text edit if necessary. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#centerCursor() centerCursor()}, and {@link QPlainTextEdit#centerOnScroll() centerOnScroll}. <br></DD></DT>
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
Returns previously set extra selections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#setExtraSelections(java.util.List) setExtraSelections()}. <br></DD></DT>
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
Returns the first visible block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#blockBoundingRect(com.trolltech.qt.gui.QTextBlock) blockBoundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTextBlock firstVisibleBlock()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstVisibleBlock(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_firstVisibleBlock(long __this__nativeId);

/**
Returns the paint context for the {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}, useful only when reimplementing {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QAbstractTextDocumentLayout_PaintContext getPaintContext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_getPaintContext(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractTextDocumentLayout_PaintContext __qt_getPaintContext(long __this__nativeId);

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
This property holds whether undo and redo are enabled. Users are only able to undo or redo actions if this property is true, and if there is an action that can be undone (or redone). <p>By default, this property is true.
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
This property holds the line wrap mode. The default mode is {@link com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode WidgetWidth } which causes words to be wrapped at the right edge of the text edit. Wrapping occurs at whitespace, keeping whole words intact. If you want wrapping to occur within words use {@link com.trolltech.qt.gui.QPlainTextEdit#setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWordWrapMode()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="lineWrapMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode lineWrapMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode.resolve(__qt_lineWrapMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_lineWrapMode(long __this__nativeId);

/**
This property holds the limit for blocks in the document.  Specifies the maximum number of blocks the document may have. If there are more blocks in the document that specified with this property blocks are removed from the beginning of the document. <p>A negative or zero value specifies that the document may contain an unlimited amount of blocks. <p>The default value is 0. <p>Note that setting this property will apply the limit immediately to the document contents. Setting this property also disables the undo redo history.
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
This property holds whether text entered by the user will overwrite existing text. As with many text editors, the plain text editor widget can be configured to insert or overwrite existing text with new text entered by the user. <p>If this property is true, existing text is overwritten, character-for-character by new text; otherwise, text is inserted at the cursor position, displacing existing text. <p>By default, this property is false (new text does not overwrite existing text).
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
Pastes the text from the clipboard into the text edit at the current cursor position. <p>If there is no text in the clipboard nothing happens. <p>To change the behavior of this function, i.e. to modify what QPlainTextEdit can paste and how it is being pasted, reimplement the virtual {@link com.trolltech.qt.gui.QPlainTextEdit#canInsertFromMimeData(com.trolltech.qt.core.QMimeData) canInsertFromMimeData()} and {@link com.trolltech.qt.gui.QPlainTextEdit#insertFromMimeData(com.trolltech.qt.core.QMimeData) insertFromMimeData()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#cut() cut()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#copy() copy()}. <br></DD></DT>
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
Redoes the last operation. <p>If there is no operation to redo, i.e. there is no redo step in the undo/redo history, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#undo() undo()}. <br></DD></DT>
*/

    public final void redo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    native void __qt_redo(long __this__nativeId);

/**
Selects all text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#copy() copy()}, {@link com.trolltech.qt.gui.QPlainTextEdit#cut() cut()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#textCursor() textCursor()}. <br></DD></DT>
*/

    public final void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    native void __qt_selectAll(long __this__nativeId);

/**
This property holds whether the palette background is visible outside the document area. If set to true, the plain text edit paints the palette background on the viewport area not covered by the text document. Otherwise, if set to false, it won't. The feature makes it possible for the user to visually distinguish between the area of the document, painted with the base color of the palette, and the empty area not covered by any document. <p>The default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="backgroundVisible")
    @QtBlockedSlot
    public final void setBackgroundVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setBackgroundVisible_boolean(long __this__nativeId, boolean visible);

/**
This property holds whether the cursor should be centered on screen. If set to true, the plain text edit scrolls the document vertically to make the cursor visible at the center of the viewport. This also allows the text edit to scroll below the end of the document. Otherwise, if set to false, the plain text edit scrolls the smallest amount possible to ensure the cursor is visible. The same algorithm is applied to any new line appended through {@link com.trolltech.qt.gui.QPlainTextEdit#appendPlainText(java.lang.String) appendPlainText()}. <p>The default is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#centerCursor() centerCursor()}, and {@link com.trolltech.qt.gui.QPlainTextEdit#ensureCursorVisible() ensureCursorVisible()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="centerOnScroll")
    @QtBlockedSlot
    public final void setCenterOnScroll(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCenterOnScroll_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setCenterOnScroll_boolean(long __this__nativeId, boolean enabled);

/**
Sets the char format that is be used when inserting new text to <tt>format</tt> by calling {@link com.trolltech.qt.gui.QTextCursor#setCharFormat(com.trolltech.qt.gui.QTextCharFormat) QTextCursor::setCharFormat()} on the editor's cursor. If the editor has a selection then the char format is directly applied to the selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#currentCharFormat() currentCharFormat()}. <br></DD></DT>
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
Makes <tt>document</tt> the new document of the text editor. <p>The parent {@link com.trolltech.qt.core.QObject QObject} of the provided document remains the owner of the object. If the current document is a child of the text editor, then it is deleted. <p>The document must have a document layout that inherits {@link com.trolltech.qt.gui.QPlainTextDocumentLayout QPlainTextDocumentLayout} (see {@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) QTextDocument::setDocumentLayout()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#document() document()}. <br></DD></DT>
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
This property holds the title of the document parsed from the text.  By default, this property contains an empty string.
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
This function allows temporarily marking certain regions in the document with a given color, specified as <tt>selections</tt>. This can be useful for example in a programming editor to mark a whole line of text with a given background color to indicate the existence of a breakpoint. <p><DT><b>See also:</b><br><DD>QTextEdit::ExtraSelection, and {@link com.trolltech.qt.gui.QPlainTextEdit#extraSelections() extraSelections()}. <br></DD></DT>
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
This property holds the line wrap mode. The default mode is {@link com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode WidgetWidth } which causes words to be wrapped at the right edge of the text edit. Wrapping occurs at whitespace, keeping whole words intact. If you want wrapping to occur within words use {@link com.trolltech.qt.gui.QPlainTextEdit#setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWordWrapMode()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="lineWrapMode")
    @QtBlockedSlot
    public final void setLineWrapMode(com.trolltech.qt.gui.QPlainTextEdit.LineWrapMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWrapMode_LineWrapMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setLineWrapMode_LineWrapMode(long __this__nativeId, int mode);

/**
This property holds the limit for blocks in the document.  Specifies the maximum number of blocks the document may have. If there are more blocks in the document that specified with this property blocks are removed from the beginning of the document. <p>A negative or zero value specifies that the document may contain an unlimited amount of blocks. <p>The default value is 0. <p>Note that setting this property will apply the limit immediately to the document contents. Setting this property also disables the undo redo history.
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
This property holds whether text entered by the user will overwrite existing text. As with many text editors, the plain text editor widget can be configured to insert or overwrite existing text with new text entered by the user. <p>If this property is true, existing text is overwritten, character-for-character by new text; otherwise, text is inserted at the cursor position, displacing existing text. <p>By default, this property is false (new text does not overwrite existing text).
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
This property gets and sets the plain text editor's contents. The previous contents are removed and undo/redo history is reset when this property is set. <p>By default, for an editor with no contents, this property contains an empty string.
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
Sets the visible <tt>cursor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#textCursor() textCursor()}. <br></DD></DT>
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
Specifies how the label should interact with user input if it displays text. <p>If the flags contain either {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::LinksAccessibleByKeyboard } or {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::TextSelectableByKeyboard } then the focus policy is also automatically set to {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus }. <p>The default value depends on whether the QPlainTextEdit is read-only or editable, and whether it is a {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser} or not.
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
This property holds whether undo and redo are enabled. Users are only able to undo or redo actions if this property is true, and if there is an action that can be undone (or redone). <p>By default, this property is true.
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
This property holds the mode QPlainTextEdit will use when wrapping text by words. By default, this property is set to {@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapAtWordBoundaryOrAnywhere }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapMode }. <br></DD></DT>
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
Returns a copy of the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} that represents the currently visible cursor. Note that changes on the returned cursor do not affect QPlainTextEdit's cursor; use {@link com.trolltech.qt.gui.QPlainTextEdit#setTextCursor(com.trolltech.qt.gui.QTextCursor) setTextCursor()} to update the visible cursor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#setTextCursor(com.trolltech.qt.gui.QTextCursor) setTextCursor()}. <br></DD></DT>
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
Specifies how the label should interact with user input if it displays text. <p>If the flags contain either {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::LinksAccessibleByKeyboard } or {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::TextSelectableByKeyboard } then the focus policy is also automatically set to {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus }. <p>The default value depends on whether the QPlainTextEdit is read-only or editable, and whether it is a {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser} or not.
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
This property gets and sets the plain text editor's contents. The previous contents are removed and undo/redo history is reset when this property is set. <p>By default, for an editor with no contents, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="plainText")
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
Undoes the last operation. <p>If there is no operation to undo, i.e. there is no undo step in the undo/redo history, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPlainTextEdit#redo() redo()}. <br></DD></DT>
*/

    public final void undo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    native void __qt_undo(long __this__nativeId);

/**
This property holds the mode QPlainTextEdit will use when wrapping text by words. By default, this property is set to {@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapAtWordBoundaryOrAnywhere }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapMode }. <br></DD></DT>
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
This function returns true if the contents of the MIME data object, specified by <tt>source</tt>, can be decoded and inserted into the document. It is called for example when during a drag operation the mouse enters this widget and it is necessary to determine whether it is possible to accept the drag.
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
This function returns a new MIME data object to represent the contents of the text edit's current selection. It is called when the selection needs to be encapsulated into a new {@link com.trolltech.qt.core.QMimeData QMimeData} object; for example, when a drag and drop operation is started, or when data is copied to the clipboard. <p>If you reimplement this function, note that the ownership of the returned {@link com.trolltech.qt.core.QMimeData QMimeData} object is passed to the caller. The selection can be retrieved by using the {@link com.trolltech.qt.gui.QPlainTextEdit#textCursor() textCursor()} function.
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
This function inserts the contents of the MIME data object, specified by <tt>source</tt>, into the text edit at the current cursor position. It is called whenever text is inserted as the result of a clipboard paste operation, or when the text edit accepts data from a drag and drop operation.
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

    public static native QPlainTextEdit fromNativePointer(QNativePointer nativePointer);

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

    protected QPlainTextEdit(QPrivateConstructor p) { super(p); } 
}
