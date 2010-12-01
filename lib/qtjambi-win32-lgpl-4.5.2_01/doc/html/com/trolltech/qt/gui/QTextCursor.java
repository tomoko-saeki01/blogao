package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextCursor class offers an API to access and modify QTextDocuments. Text cursors are objects that are used to access and modify the contents and underlying structure of text documents via a programming interface that mimics the behavior of a cursor in a text editor. QTextCursor contains information about both the cursor's position within a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} and any selection that it has made. <p>QTextCursor is modeled on the way a text cursor behaves in a text editor, providing a programmatic means of performing standard actions through the user interface. A document can be thought of as a single string of characters with the cursor's {@link com.trolltech.qt.gui.QTextCursor#position() position()} being between any two characters (or at the very beginning or very end of the document). Documents can also contain tables, lists, images, and other objects in addition to text but, from the developer's point of view, the document can be treated as one long string. Some portions of that string can be considered to lie within particular blocks (e.g. paragraphs), or within a table's cell, or a list's item, or other structural elements. When we refer to "current character" we mean the character immediately after the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} in the document; similarly the "current block" is the block that contains the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()}. <p>A QTextCursor also has an {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()} position. The text that is between the {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()} and the {@link com.trolltech.qt.gui.QTextCursor#position() position()} is the selection. If {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()} == {@link com.trolltech.qt.gui.QTextCursor#position() position()} there is no selection. <p>The cursor position can be changed programmatically using {@link com.trolltech.qt.gui.QTextCursor#setPosition(int) setPosition()} and {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}; the latter can also be used to select text. For selections see {@link com.trolltech.qt.gui.QTextCursor#selectionStart() selectionStart()}, {@link com.trolltech.qt.gui.QTextCursor#selectionEnd() selectionEnd()}, {@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}, {@link com.trolltech.qt.gui.QTextCursor#clearSelection() clearSelection()}, and {@link com.trolltech.qt.gui.QTextCursor#removeSelectedText() removeSelectedText()}. <p>If the {@link com.trolltech.qt.gui.QTextCursor#position() position()} is at the start of a block {@link com.trolltech.qt.gui.QTextCursor#atBlockStart() atBlockStart()} returns true; and if it is at the end of a block {@link com.trolltech.qt.gui.QTextCursor#atBlockEnd() atBlockEnd()} returns true. The format of the current character is returned by {@link com.trolltech.qt.gui.QTextCursor#charFormat() charFormat()}, and the format of the current block is returned by {@link com.trolltech.qt.gui.QTextCursor#blockFormat() blockFormat()}. <p>Formatting can be applied to the current text document using the {@link com.trolltech.qt.gui.QTextCursor#setCharFormat(com.trolltech.qt.gui.QTextCharFormat) setCharFormat()}, {@link com.trolltech.qt.gui.QTextCursor#mergeCharFormat(com.trolltech.qt.gui.QTextCharFormat) mergeCharFormat()}, {@link com.trolltech.qt.gui.QTextCursor#setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) setBlockFormat()} and {@link com.trolltech.qt.gui.QTextCursor#mergeBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) mergeBlockFormat()} functions. The 'set' functions will replace the cursor's current character or block format, while the 'merge' functions add the given format properties to the cursor's current format. If the cursor has a selection the given format is applied to the current selection. Note that when only parts of a block is selected the block format is applied to the entire block. The text at the current character position can be turned into a list using {@link com.trolltech.qt.gui.QTextCursor#createList(com.trolltech.qt.gui.QTextListFormat.Style) createList()}. <p>Deletions can be achieved using {@link com.trolltech.qt.gui.QTextCursor#deleteChar() deleteChar()}, {@link com.trolltech.qt.gui.QTextCursor#deletePreviousChar() deletePreviousChar()}, and {@link com.trolltech.qt.gui.QTextCursor#removeSelectedText() removeSelectedText()}. <p>Text strings can be inserted into the document with the {@link com.trolltech.qt.gui.QTextCursor#insertText(java.lang.String) insertText()} function, blocks (representing new paragraphs) can be inserted with {@link com.trolltech.qt.gui.QTextCursor#insertBlock() insertBlock()}. <p>Existing fragments of text can be inserted with {@link com.trolltech.qt.gui.QTextCursor#insertFragment(com.trolltech.qt.gui.QTextDocumentFragment) insertFragment()} but, if you want to insert pieces of text in various formats, it is usually still easier to use {@link com.trolltech.qt.gui.QTextCursor#insertText(java.lang.String) insertText()} and supply a character format. <p>Various types of higher-level structure can also be inserted into the document with the cursor: <ul><li> Lists are ordered sequences of block elements that are decorated with bullet points or symbols. These are inserted in a specified format with {@link com.trolltech.qt.gui.QTextCursor#insertList(com.trolltech.qt.gui.QTextListFormat.Style) insertList()}.</li><li> Tables are inserted with the {@link com.trolltech.qt.gui.QTextCursor#insertTable(int, int) insertTable()} function, and can be given an optional format. These contain an array of cells that can be traversed using the cursor.</li><li> Inline images are inserted with {@link com.trolltech.qt.gui.QTextCursor#insertImage(com.trolltech.qt.gui.QImage) insertImage()}. The image to be used can be specified in an image format, or by name.</li><li> Frames are inserted by calling {@link com.trolltech.qt.gui.QTextCursor#insertFrame(com.trolltech.qt.gui.QTextFrameFormat) insertFrame()} with a specified format.</li></ul> Actions can be grouped (i.e. treated as a single action for undo/redo) using {@link com.trolltech.qt.gui.QTextCursor#beginEditBlock() beginEditBlock()} and {@link com.trolltech.qt.gui.QTextCursor#endEditBlock() endEditBlock()}. <p>Cursor movements are limited to valid cursor positions. In Latin writing this is usually after every character in the text. In some other writing systems cursor movements are limited to "clusters" (e.g. a syllable in Devanagari, or a base letter plus diacritics). Functions such as {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()} and {@link com.trolltech.qt.gui.QTextCursor#deleteChar() deleteChar()} limit cursor movement to these valid positions. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext.html">Rich Text Processing</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextCursor extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
If the {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()} is kept where it is and the {@link com.trolltech.qt.gui.QTextCursor#position() position()} is moved, the text in between will be selected.
*/

    public enum MoveMode implements com.trolltech.qt.QtEnumerator {
/**
 Moves the anchor to the same position as the cursor itself.
*/

        MoveAnchor(0),
/**
 Keeps the anchor where it is.
*/

        KeepAnchor(1);

        MoveMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextCursor$MoveMode constant with the specified <tt>int</tt>.</brief>
*/

        public static MoveMode resolve(int value) {
            return (MoveMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MoveAnchor;
            case 1: return KeepAnchor;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}. <br></DD></DT>
*/

    public enum MoveOperation implements com.trolltech.qt.QtEnumerator {
/**
 Keep the cursor where it is
*/

        NoMove(0),
/**
 Move to the start of the document.
*/

        Start(1),
/**
 Move up one line.
*/

        Up(2),
/**
 Move to the start of the current line.
*/

        StartOfLine(3),
/**
 Move to the start of the current block.
*/

        StartOfBlock(4),
/**
 Move to the start of the current word.
*/

        StartOfWord(5),
/**
 Move to the start of the previous block.
*/

        PreviousBlock(6),
/**
 Move to the previous character.
*/

        PreviousCharacter(7),
/**
 Move to the beginning of the previous word.
*/

        PreviousWord(8),
/**
 Move left one character.
*/

        Left(9),
/**
 Move left one word.
*/

        WordLeft(10),
/**
 Move to the end of the document.
*/

        End(11),
/**
 Move down one line.
*/

        Down(12),
/**
 Move to the end of the current line.
*/

        EndOfLine(13),
/**
 Move to the end of the current word.
*/

        EndOfWord(14),
/**
 Move to the end of the current block.
*/

        EndOfBlock(15),
/**
 Move to the beginning of the next block.
*/

        NextBlock(16),
/**
 Move to the next character.
*/

        NextCharacter(17),
/**
 Move to the next word.
*/

        NextWord(18),
/**
 Move right one character.
*/

        Right(19),
/**
 Move right one word.
*/

        WordRight(20),
/**
 Move to the beginning of the next table cell inside the current table. If the current cell is the last cell in the row, the cursor will move to the first cell in the next row.
*/

        NextCell(21),
/**
 Move to the beginning of the previous table cell inside the current table. If the current cell is the first cell in the row, the cursor will move to the last cell in the previous row.
*/

        PreviousCell(22),
/**
 Move to the first new cell of the next row in the current table.
*/

        NextRow(23),
/**
 Move to the last cell of the previous row in the current table.
*/

        PreviousRow(24);

        MoveOperation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextCursor$MoveOperation constant with the specified <tt>int</tt>.</brief>
*/

        public static MoveOperation resolve(int value) {
            return (MoveOperation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoMove;
            case 1: return Start;
            case 2: return Up;
            case 3: return StartOfLine;
            case 4: return StartOfBlock;
            case 5: return StartOfWord;
            case 6: return PreviousBlock;
            case 7: return PreviousCharacter;
            case 8: return PreviousWord;
            case 9: return Left;
            case 10: return WordLeft;
            case 11: return End;
            case 12: return Down;
            case 13: return EndOfLine;
            case 14: return EndOfWord;
            case 15: return EndOfBlock;
            case 16: return NextBlock;
            case 17: return NextCharacter;
            case 18: return NextWord;
            case 19: return Right;
            case 20: return WordRight;
            case 21: return NextCell;
            case 22: return PreviousCell;
            case 23: return NextRow;
            case 24: return PreviousRow;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the types of selection that can be applied with the {@link com.trolltech.qt.gui.QTextCursor#select(com.trolltech.qt.gui.QTextCursor.SelectionType) select()} function.
*/

    public enum SelectionType implements com.trolltech.qt.QtEnumerator {
/**
 Selects the word under the cursor. If the cursor is not positioned within a string of selectable characters, no text is selected.
*/

        WordUnderCursor(0),
/**
 Selects the line of text under the cursor.
*/

        LineUnderCursor(1),
/**
 Selects the block of text under the cursor.
*/

        BlockUnderCursor(2),
/**
 Selects the entire document.
*/

        Document(3);

        SelectionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextCursor$SelectionType constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectionType resolve(int value) {
            return (SelectionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WordUnderCursor;
            case 1: return LineUnderCursor;
            case 2: return BlockUnderCursor;
            case 3: return Document;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a null cursor.
*/

    public QTextCursor(){
        super((QPrivateConstructor)null);
        __qt_QTextCursor();
    }

    native void __qt_QTextCursor();

/**
Constructs a cursor pointing to the beginning of the <tt>document</tt>.
*/

    public QTextCursor(com.trolltech.qt.gui.QTextDocument document){
        super((QPrivateConstructor)null);
        __qt_QTextCursor_QTextDocument(document == null ? 0 : document.nativeId());
    }

    native void __qt_QTextCursor_QTextDocument(long document);

/**
Constructs a cursor pointing to the beginning of the <tt>frame</tt>.
*/

    public QTextCursor(com.trolltech.qt.gui.QTextFrame frame){
        super((QPrivateConstructor)null);
        __qt_QTextCursor_QTextFrame(frame == null ? 0 : frame.nativeId());
    }

    native void __qt_QTextCursor_QTextFrame(long frame);

/**
Constructs a cursor pointing to the beginning of the <tt>block</tt>.
*/

    public QTextCursor(com.trolltech.qt.gui.QTextBlock block){
        super((QPrivateConstructor)null);
        __qt_QTextCursor_QTextBlock(block == null ? 0 : block.nativeId());
    }

    native void __qt_QTextCursor_QTextBlock(long block);

/**
Constructs a new cursor that is a copy of <tt>cursor</tt>.
*/

    public QTextCursor(com.trolltech.qt.gui.QTextCursor cursor){
        super((QPrivateConstructor)null);
        __qt_QTextCursor_QTextCursor(cursor == null ? 0 : cursor.nativeId());
    }

    native void __qt_QTextCursor_QTextCursor(long cursor);

/**
Returns the anchor position; this is the same as {@link com.trolltech.qt.gui.QTextCursor#position() position()} unless there is a selection in which case {@link com.trolltech.qt.gui.QTextCursor#position() position()} marks one end of the selection and {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()} marks the other end. Just like the cursor position, the anchor position is between characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#position() position()}, {@link com.trolltech.qt.gui.QTextCursor#setPosition(int) setPosition()}, {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}, {@link com.trolltech.qt.gui.QTextCursor#selectionStart() selectionStart()}, and {@link com.trolltech.qt.gui.QTextCursor#selectionEnd() selectionEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int anchor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_anchor(nativeId());
    }
    @QtBlockedSlot
    native int __qt_anchor(long __this__nativeId);

/**
Returns true if the cursor is at the end of a block; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#atBlockStart() atBlockStart()}, and {@link com.trolltech.qt.gui.QTextCursor#atEnd() atEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atBlockEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atBlockEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atBlockEnd(long __this__nativeId);

/**
Returns true if the cursor is at the start of a block; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#atBlockEnd() atBlockEnd()}, and {@link com.trolltech.qt.gui.QTextCursor#atStart() atStart()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atBlockStart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atBlockStart(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atBlockStart(long __this__nativeId);

/**
Returns true if the cursor is at the end of the document; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#atStart() atStart()}, and {@link com.trolltech.qt.gui.QTextCursor#atBlockEnd() atBlockEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
Returns true if the cursor is at the start of the document; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#atBlockStart() atBlockStart()}, and {@link com.trolltech.qt.gui.QTextCursor#atEnd() atEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atStart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atStart(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atStart(long __this__nativeId);

/**
Indicates the start of a block of editing operations on the document that should appear as a single operation from an undo/redo point of view. <p>For example: <pre class="snippet">
        QTextCursor cursor = new QTextCursor(textDocument);
        cursor.beginEditBlock();
        cursor.insertText("Hello");
        cursor.insertText("World");
        cursor.endEditBlock();

        textDocument.undo();
        </pre> The call to undo() will cause both insertions to be undone, causing both "World" and "Hello" to be removed. <p>It is possible to nest calls to beginEditBlock and endEditBlock. The top-most pair will determine the scope of the undo/redo operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#endEditBlock() endEditBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void beginEditBlock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginEditBlock(nativeId());
    }
    @QtBlockedSlot
    native void __qt_beginEditBlock(long __this__nativeId);

/**
Returns the block that contains the cursor.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock block()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_block(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_block(long __this__nativeId);

/**
Returns the block character format of the block the cursor is in. <p>The block char format is the format used when inserting text at the beginning of an empty block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockCharFormat(com.trolltech.qt.gui.QTextCharFormat) setBlockCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat blockCharFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockCharFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_blockCharFormat(long __this__nativeId);

/**
Returns the block format of the block the cursor is in. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) setBlockFormat()}, and {@link com.trolltech.qt.gui.QTextCursor#charFormat() charFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlockFormat blockFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlockFormat __qt_blockFormat(long __this__nativeId);

/**
Returns the number of the block the cursor is in, or 0 if the cursor is invalid. <p>Note that this function only makes sense in documents without complex objects such as tables or frames.
*/

    @QtBlockedSlot
    public final int blockNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_blockNumber(long __this__nativeId);

/**
Returns the format of the character immediately before the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()}. If the cursor is positioned at the beginning of a text block that is not empty then the format of the character immediately after the cursor is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setCharFormat(com.trolltech.qt.gui.QTextCharFormat) setCharFormat()}, {@link com.trolltech.qt.gui.QTextCursor#insertText(java.lang.String) insertText()}, and {@link com.trolltech.qt.gui.QTextCursor#blockFormat() blockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat charFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_charFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_charFormat(long __this__nativeId);

/**
Clears the current selection by setting the anchor to the cursor position. <p>Note that it does <b>not</b> delete the text of the selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#removeSelectedText() removeSelectedText()}, and {@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearSelection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearSelection(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearSelection(long __this__nativeId);

/**
Returns the position of the cursor within its containing line.
*/

    @QtBlockedSlot
    public final int columnNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnNumber(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a new list with the given <tt>style</tt>, making the cursor's current paragraph the first list item. <p>The style to be used is defined by the {@link com.trolltech.qt.gui.QTextListFormat.Style QTextListFormat::Style } enum. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#insertList(com.trolltech.qt.gui.QTextListFormat.Style) insertList()}, and {@link com.trolltech.qt.gui.QTextCursor#currentList() currentList()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextList createList(com.trolltech.qt.gui.QTextListFormat.Style style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createList_Style(nativeId(), style.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextList __qt_createList_Style(long __this__nativeId, int style);

/**
Creates and returns a new list with the given <tt>format</tt>, and makes the current paragraph the cursor is in the first list item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#insertList(com.trolltech.qt.gui.QTextListFormat.Style) insertList()}, and {@link com.trolltech.qt.gui.QTextCursor#currentList() currentList()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextList createList(com.trolltech.qt.gui.QTextListFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createList_QTextListFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextList __qt_createList_QTextListFormat(long __this__nativeId, long format);

/**
Returns a pointer to the current frame. Returns 0 if the cursor is invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#insertFrame(com.trolltech.qt.gui.QTextFrameFormat) insertFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame currentFrame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_currentFrame(long __this__nativeId);

/**
Returns the current list if the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} is inside a block that is part of a list; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#insertList(com.trolltech.qt.gui.QTextListFormat.Style) insertList()}, and {@link com.trolltech.qt.gui.QTextCursor#createList(com.trolltech.qt.gui.QTextListFormat.Style) createList()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextList currentList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentList(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextList __qt_currentList(long __this__nativeId);

/**
Returns a pointer to the current table if the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} is inside a block that is part of a table; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#insertTable(int, int) insertTable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTable currentTable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentTable(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTable __qt_currentTable(long __this__nativeId);

/**
If there is no selected text, deletes the character at the current cursor position; otherwise deletes the selected text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#deletePreviousChar() deletePreviousChar()}, {@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}, and {@link com.trolltech.qt.gui.QTextCursor#clearSelection() clearSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void deleteChar()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deleteChar(nativeId());
    }
    @QtBlockedSlot
    native void __qt_deleteChar(long __this__nativeId);

/**
If there is no selected text, deletes the character before the current cursor position; otherwise deletes the selected text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#deleteChar() deleteChar()}, {@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}, and {@link com.trolltech.qt.gui.QTextCursor#clearSelection() clearSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void deletePreviousChar()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deletePreviousChar(nativeId());
    }
    @QtBlockedSlot
    native void __qt_deletePreviousChar(long __this__nativeId);

/**
Returns the document this cursor is associated with.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocument document()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_document(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextDocument __qt_document(long __this__nativeId);

/**
Indicates the end of a block of editing operations on the document that should appear as a single operation from an undo/redo point of view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#beginEditBlock() beginEditBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void endEditBlock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endEditBlock(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endEditBlock(long __this__nativeId);

/**
Returns true if the cursor contains a selection that is not simply a range from {@link com.trolltech.qt.gui.QTextCursor#selectionStart() selectionStart()} to {@link com.trolltech.qt.gui.QTextCursor#selectionEnd() selectionEnd()}; otherwise returns false. <p>Complex selections are ones that span at least two cells in a table; their extent is specified by {@link com.trolltech.qt.gui.QTextCursor#selectedTableCells() selectedTableCells()}.
*/

    @QtBlockedSlot
    public final boolean hasComplexSelection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasComplexSelection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasComplexSelection(long __this__nativeId);

/**
Returns true if the cursor contains a selection; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasSelection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasSelection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasSelection(long __this__nativeId);

/**
Inserts a new empty block at the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} with the current {@link com.trolltech.qt.gui.QTextCursor#blockFormat() blockFormat()} and {@link com.trolltech.qt.gui.QTextCursor#charFormat() charFormat()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) setBlockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertBlock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertBlock(nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertBlock(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Inserts a new empty block at the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} with block format <tt>format</tt> and the current {@link com.trolltech.qt.gui.QTextCursor#charFormat() charFormat()} as block char format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) setBlockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertBlock(com.trolltech.qt.gui.QTextBlockFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertBlock_QTextBlockFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertBlock_QTextBlockFormat(long __this__nativeId, long format);

/**
This is an overloaded member function, provided for convenience. <p>Inserts a new empty block at the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} with block format <tt>format</tt> and <tt>charFormat</tt> as block char format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) setBlockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertBlock(com.trolltech.qt.gui.QTextBlockFormat format, com.trolltech.qt.gui.QTextCharFormat charFormat)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertBlock_QTextBlockFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId(), charFormat == null ? 0 : charFormat.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertBlock_QTextBlockFormat_QTextCharFormat(long __this__nativeId, long format, long charFormat);

/**
Inserts the text <tt>fragment</tt> at the current {@link com.trolltech.qt.gui.QTextCursor#position() position()}.
*/

    @QtBlockedSlot
    public final void insertFragment(com.trolltech.qt.gui.QTextDocumentFragment fragment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertFragment_QTextDocumentFragment(nativeId(), fragment == null ? 0 : fragment.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertFragment_QTextDocumentFragment(long __this__nativeId, long fragment);

/**
Inserts a frame with the given <tt>format</tt> at the current cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()}, moves the cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} inside the frame, and returns the frame. <p>If the cursor holds a selection, the whole selection is moved inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame insertFrame(com.trolltech.qt.gui.QTextFrameFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertFrame_QTextFrameFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_insertFrame_QTextFrameFormat(long __this__nativeId, long format);

/**
Inserts the text <tt>html</tt> at the current {@link com.trolltech.qt.gui.QTextCursor#position() position()}. The text is interpreted as HTML. <p><b>Note:</b> When using this function with a style sheet, the style sheet will only apply to the current block in the document. In order to apply a style sheet throughout a document, use {@link QTextDocument#setDefaultStyleSheet(java.lang.String) QTextDocument::setDefaultStyleSheet()} instead.
*/

    @QtBlockedSlot
    public final void insertHtml(java.lang.String html)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertHtml_String(nativeId(), html);
    }
    @QtBlockedSlot
    native void __qt_insertHtml_String(long __this__nativeId, java.lang.String html);


/**
This is an overloaded member function, provided for convenience. <p>Convenience function for inserting the given <tt>image</tt> with an optional <tt>name</tt> at the current {@link com.trolltech.qt.gui.QTextCursor#position() position()}.
*/

    @QtBlockedSlot
    public final void insertImage(com.trolltech.qt.gui.QImage image) {
        insertImage(image, (java.lang.String)null);
    }
/**
This is an overloaded member function, provided for convenience. <p>Convenience function for inserting the given <tt>image</tt> with an optional <tt>name</tt> at the current {@link com.trolltech.qt.gui.QTextCursor#position() position()}.
*/

    @QtBlockedSlot
    public final void insertImage(com.trolltech.qt.gui.QImage image, java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertImage_QImage_String(nativeId(), image == null ? 0 : image.nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_insertImage_QImage_String(long __this__nativeId, long image, java.lang.String name);

/**
This is an overloaded member function, provided for convenience. <p>Convenience method for inserting the image with the given <tt>name</tt> at the current {@link com.trolltech.qt.gui.QTextCursor#position() position()}. <pre class="snippet">
        QImage img = new QImage();
        textDocument.addResource(QTextDocument.ResourceType.ImageResource.value(), new QUrl("myimage"), img);
        cursor.insertImage("myimage");
        </pre>
*/

    @QtBlockedSlot
    public final void insertImage(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertImage_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_insertImage_String(long __this__nativeId, java.lang.String name);

/**
Inserts the image defined by <tt>format</tt> at the current {@link com.trolltech.qt.gui.QTextCursor#position() position()}.
*/

    @QtBlockedSlot
    public final void insertImage(com.trolltech.qt.gui.QTextImageFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertImage_QTextImageFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertImage_QTextImageFormat(long __this__nativeId, long format);

/**
This is an overloaded member function, provided for convenience. <p>Inserts the image defined by the given <tt>format</tt> at the cursor's current position with the specified <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertImage(com.trolltech.qt.gui.QTextImageFormat format, com.trolltech.qt.gui.QTextFrameFormat.Position alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertImage_QTextImageFormat_Position(nativeId(), format == null ? 0 : format.nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_insertImage_QTextImageFormat_Position(long __this__nativeId, long format, int alignment);

/**
This is an overloaded member function, provided for convenience. <p>Inserts a new block at the current position and makes it the first list item of a newly created list with the given <tt>style</tt>. Returns the created list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#currentList() currentList()}, {@link com.trolltech.qt.gui.QTextCursor#createList(com.trolltech.qt.gui.QTextListFormat.Style) createList()}, and {@link com.trolltech.qt.gui.QTextCursor#insertBlock() insertBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextList insertList(com.trolltech.qt.gui.QTextListFormat.Style style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertList_Style(nativeId(), style.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextList __qt_insertList_Style(long __this__nativeId, int style);

/**
Inserts a new block at the current position and makes it the first list item of a newly created list with the given <tt>format</tt>. Returns the created list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#currentList() currentList()}, {@link com.trolltech.qt.gui.QTextCursor#createList(com.trolltech.qt.gui.QTextListFormat.Style) createList()}, and {@link com.trolltech.qt.gui.QTextCursor#insertBlock() insertBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextList insertList(com.trolltech.qt.gui.QTextListFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertList_QTextListFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextList __qt_insertList_QTextListFormat(long __this__nativeId, long format);

/**
This is an overloaded member function, provided for convenience. <p>Creates a new table with the given number of <tt>rows</tt> and <tt>columns</tt>, inserts it at the current cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} in the document, and returns the table object. The cursor is moved to the beginning of the first cell. <p>There must be at least one row and one column in the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#currentTable() currentTable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTable insertTable(int rows, int cols)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertTable_int_int(nativeId(), rows, cols);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTable __qt_insertTable_int_int(long __this__nativeId, int rows, int cols);

/**
Creates a new table with the given number of <tt>rows</tt> and <tt>columns</tt> in the specified <tt>format</tt>, inserts it at the current cursor {@link com.trolltech.qt.gui.QTextCursor#position() position()} in the document, and returns the table object. The cursor is moved to the beginning of the first cell. <p>There must be at least one row and one column in the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#currentTable() currentTable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTable insertTable(int rows, int cols, com.trolltech.qt.gui.QTextTableFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertTable_int_int_QTextTableFormat(nativeId(), rows, cols, format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTable __qt_insertTable_int_int_QTextTableFormat(long __this__nativeId, int rows, int cols, long format);

/**
Inserts <tt>text</tt> at the current position, using the current character format. <p>If there is a selection, the selection is deleted and replaced by <tt>text</tt>, for example: <pre class="snippet">
        cursor.clearSelection();
        cursor.movePosition(QTextCursor.MoveOperation.NextWord, QTextCursor.MoveMode.KeepAnchor);
        cursor.insertText("Hello World");
        </pre> This clears any existing selection, selects the word at the cursor (i.e. from {@link com.trolltech.qt.gui.QTextCursor#position() position()} forward), and replaces the selection with the phrase "Hello World". <p>Any ASCII linefeed characters (\n) in the inserted text are transformed into unicode block separators, corresponding to {@link com.trolltech.qt.gui.QTextCursor#insertBlock() insertBlock()} calls. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#charFormat() charFormat()}, and {@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_insertText_String(long __this__nativeId, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>Inserts <tt>text</tt> at the current position with the given <tt>format</tt>.
*/

    @QtBlockedSlot
    public final void insertText(java.lang.String text, com.trolltech.qt.gui.QTextCharFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertText_String_QTextCharFormat(nativeId(), text, format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertText_String_QTextCharFormat(long __this__nativeId, java.lang.String text, long format);

/**
Returns true if this cursor and <tt>other</tt> are copies of each other, i.e. one of them was created as a copy of the other and neither has moved since. This is much stricter than equality. <p><DT><b>See also:</b><br><DD>operator=(), and operator==(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCopyOf(com.trolltech.qt.gui.QTextCursor other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCopyOf_QTextCursor(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCopyOf_QTextCursor(long __this__nativeId, long other);

/**
Returns true if the cursor is null; otherwise returns false. A null cursor is created by the default constructor.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Like {@link com.trolltech.qt.gui.QTextCursor#beginEditBlock() beginEditBlock()} indicates the start of a block of editing operations that should appear as a single operation for undo/redo. However unlike {@link com.trolltech.qt.gui.QTextCursor#beginEditBlock() beginEditBlock()} it does not start a new block but reverses the previous call to {@link com.trolltech.qt.gui.QTextCursor#endEditBlock() endEditBlock()} and therefore makes following operations part of the previous edit block created. <p>For example: <pre class="snippet">
        QTextCursor cursor = new QTextCursor(textDocument);
        cursor.beginEditBlock();
        cursor.insertText("Hello");
        cursor.insertText("World");
        cursor.endEditBlock();

        // ...

        cursor.joinPreviousEditBlock();
        cursor.insertText("Hey");
        cursor.endEditBlock();

        textDocument.undo();
        </pre> The call to undo() will cause all three insertions to be undone. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#beginEditBlock() beginEditBlock()}, and {@link com.trolltech.qt.gui.QTextCursor#endEditBlock() endEditBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void joinPreviousEditBlock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_joinPreviousEditBlock(nativeId());
    }
    @QtBlockedSlot
    native void __qt_joinPreviousEditBlock(long __this__nativeId);

/**
Modifies the block char format of the current block (or all blocks that are contained in the selection) with the block format specified by <tt>modifier</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockCharFormat(com.trolltech.qt.gui.QTextCharFormat) setBlockCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void mergeBlockCharFormat(com.trolltech.qt.gui.QTextCharFormat modifier)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mergeBlockCharFormat_QTextCharFormat(nativeId(), modifier == null ? 0 : modifier.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mergeBlockCharFormat_QTextCharFormat(long __this__nativeId, long modifier);

/**
Modifies the block format of the current block (or all blocks that are contained in the selection) with the block format specified by <tt>modifier</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) setBlockFormat()}, and {@link com.trolltech.qt.gui.QTextCursor#blockFormat() blockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void mergeBlockFormat(com.trolltech.qt.gui.QTextBlockFormat modifier)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mergeBlockFormat_QTextBlockFormat(nativeId(), modifier == null ? 0 : modifier.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mergeBlockFormat_QTextBlockFormat(long __this__nativeId, long modifier);

/**
Merges the cursor's current character format with the properties described by format <tt>modifier</tt>. If the cursor has a selection, this function applies all the properties set in <tt>modifier</tt> to all the character formats that are part of the selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}, and {@link com.trolltech.qt.gui.QTextCursor#setCharFormat(com.trolltech.qt.gui.QTextCharFormat) setCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void mergeCharFormat(com.trolltech.qt.gui.QTextCharFormat modifier)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mergeCharFormat_QTextCharFormat(nativeId(), modifier == null ? 0 : modifier.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mergeCharFormat_QTextCharFormat(long __this__nativeId, long modifier);


/**
Moves the cursor by performing the given <tt>operation</tt><tt>n</tt> times, using the specified <tt>mode</tt>, and returns true if all operations were completed successfully; otherwise returns false. <p>For example, if this function is repeatedly used to seek to the end of the next word, it will eventually fail when the end of the document is reached. <p>By default, the move operation is performed once (<tt>n</tt> = 1). <p>If <tt>mode</tt> is <tt>KeepAnchor</tt>, the cursor selects the text it moves over. This is the same effect that the user achieves when they hold down the Shift key and move the cursor with the cursor keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setVisualNavigation(boolean) setVisualNavigation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation op, com.trolltech.qt.gui.QTextCursor.MoveMode arg__2) {
        return movePosition(op, arg__2, (int)1);
    }

/**
Moves the cursor by performing the given <tt>operation</tt><tt>n</tt> times, using the specified <tt>mode</tt>, and returns true if all operations were completed successfully; otherwise returns false. <p>For example, if this function is repeatedly used to seek to the end of the next word, it will eventually fail when the end of the document is reached. <p>By default, the move operation is performed once (<tt>n</tt> = 1). <p>If <tt>mode</tt> is <tt>KeepAnchor</tt>, the cursor selects the text it moves over. This is the same effect that the user achieves when they hold down the Shift key and move the cursor with the cursor keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setVisualNavigation(boolean) setVisualNavigation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation op) {
        return movePosition(op, com.trolltech.qt.gui.QTextCursor.MoveMode.MoveAnchor, (int)1);
    }
/**
Moves the cursor by performing the given <tt>operation</tt><tt>n</tt> times, using the specified <tt>mode</tt>, and returns true if all operations were completed successfully; otherwise returns false. <p>For example, if this function is repeatedly used to seek to the end of the next word, it will eventually fail when the end of the document is reached. <p>By default, the move operation is performed once (<tt>n</tt> = 1). <p>If <tt>mode</tt> is <tt>KeepAnchor</tt>, the cursor selects the text it moves over. This is the same effect that the user achieves when they hold down the Shift key and move the cursor with the cursor keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setVisualNavigation(boolean) setVisualNavigation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation op, com.trolltech.qt.gui.QTextCursor.MoveMode arg__2, int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_movePosition_MoveOperation_MoveMode_int(nativeId(), op.value(), arg__2.value(), n);
    }
    @QtBlockedSlot
    native boolean __qt_movePosition_MoveOperation_MoveMode_int(long __this__nativeId, int op, int arg__2, int n);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.gui.QTextCursor rhs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QTextCursor(nativeId(), rhs == null ? 0 : rhs.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QTextCursor(long __this__nativeId, long rhs);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QTextCursor rhs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextCursor(nativeId(), rhs == null ? 0 : rhs.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextCursor(long __this__nativeId, long rhs);

/**
Returns the absolute position of the cursor within the document. The cursor is positioned between characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setPosition(int) setPosition()}, {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}, and {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_position(nativeId());
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
If there is a selection, its content is deleted; otherwise does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeSelectedText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeSelectedText(nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeSelectedText(long __this__nativeId);

/**
Selects text in the document according to the given <tt>selection</tt>.
*/

    @QtBlockedSlot
    public final void select(com.trolltech.qt.gui.QTextCursor.SelectionType selection)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_select_SelectionType(nativeId(), selection.value());
    }
    @QtBlockedSlot
    native void __qt_select_SelectionType(long __this__nativeId, int selection);

    @QtBlockedSlot
    private final void selectedTableCells(com.trolltech.qt.QNativePointer firstRow, com.trolltech.qt.QNativePointer numRows, com.trolltech.qt.QNativePointer firstColumn, com.trolltech.qt.QNativePointer numColumns)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectedTableCells_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), firstRow, numRows, firstColumn, numColumns);
    }
    @QtBlockedSlot
    native void __qt_selectedTableCells_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer firstRow, com.trolltech.qt.QNativePointer numRows, com.trolltech.qt.QNativePointer firstColumn, com.trolltech.qt.QNativePointer numColumns);

/**
Returns the current selection's text (which may be empty). This only returns the text, with no rich text formatting information. If you want a document fragment (i.e. formatted rich text) use {@link com.trolltech.qt.gui.QTextCursor#selection() selection()} instead. <p><b>Note:</b> If the selection obtained from an editor spans a line break, the text will contain a Unicode U+2029 paragraph separator character instead of a newline <tt>\n</tt> character. Use QString::replace() to replace these characters with newlines.
*/

    @QtBlockedSlot
    public final java.lang.String selectedText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_selectedText(long __this__nativeId);

/**
Returns the current selection (which may be empty) with all its formatting information. If you just want the selected text (i.e. plain text) use {@link com.trolltech.qt.gui.QTextCursor#selectedText() selectedText()} instead. <p><b>Note:</b> Unlike {@link com.trolltech.qt.gui.QTextDocumentFragment#toPlainText() QTextDocumentFragment::toPlainText()}, {@link com.trolltech.qt.gui.QTextCursor#selectedText() selectedText()} may include special unicode characters such as {@link null.SpecialCharacter QChar::ParagraphSeparator }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentFragment#toPlainText() QTextDocumentFragment::toPlainText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocumentFragment selection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selection(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextDocumentFragment __qt_selection(long __this__nativeId);

/**
Returns the end of the selection or {@link com.trolltech.qt.gui.QTextCursor#position() position()} if the cursor doesn't have a selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#selectionStart() selectionStart()}, {@link com.trolltech.qt.gui.QTextCursor#position() position()}, and {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int selectionEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectionEnd(nativeId());
    }
    @QtBlockedSlot
    native int __qt_selectionEnd(long __this__nativeId);

/**
Returns the start of the selection or {@link com.trolltech.qt.gui.QTextCursor#position() position()} if the cursor doesn't have a selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#selectionEnd() selectionEnd()}, {@link com.trolltech.qt.gui.QTextCursor#position() position()}, and {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int selectionStart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectionStart(nativeId());
    }
    @QtBlockedSlot
    native int __qt_selectionStart(long __this__nativeId);

/**
Sets the block char format of the current block (or all blocks that are contained in the selection) to <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#blockCharFormat() blockCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBlockCharFormat(com.trolltech.qt.gui.QTextCharFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBlockCharFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBlockCharFormat_QTextCharFormat(long __this__nativeId, long format);

/**
Sets the block format of the current block (or all blocks that are contained in the selection) to <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#blockFormat() blockFormat()}, and {@link com.trolltech.qt.gui.QTextCursor#mergeBlockFormat(com.trolltech.qt.gui.QTextBlockFormat) mergeBlockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBlockFormat(com.trolltech.qt.gui.QTextBlockFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBlockFormat_QTextBlockFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBlockFormat_QTextBlockFormat(long __this__nativeId, long format);

/**
Sets the cursor's current character format to the given <tt>format</tt>. If the cursor has a selection, the given <tt>format</tt> is applied to the current selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#charFormat() charFormat()}, {@link com.trolltech.qt.gui.QTextCursor#hasSelection() hasSelection()}, and {@link com.trolltech.qt.gui.QTextCursor#mergeCharFormat(com.trolltech.qt.gui.QTextCharFormat) mergeCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCharFormat(com.trolltech.qt.gui.QTextCharFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCharFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCharFormat_QTextCharFormat(long __this__nativeId, long format);


/**
Moves the cursor to the absolute position in the document specified by <tt>pos</tt> using a <tt>MoveMode</tt> specified by <tt>m</tt>. The cursor is positioned between characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#position() position()}, {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}, and {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosition(int pos) {
        setPosition(pos, com.trolltech.qt.gui.QTextCursor.MoveMode.MoveAnchor);
    }
/**
Moves the cursor to the absolute position in the document specified by <tt>pos</tt> using a <tt>MoveMode</tt> specified by <tt>m</tt>. The cursor is positioned between characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#position() position()}, {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}, and {@link com.trolltech.qt.gui.QTextCursor#anchor() anchor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosition(int pos, com.trolltech.qt.gui.QTextCursor.MoveMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_int_MoveMode(nativeId(), pos, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setPosition_int_MoveMode(long __this__nativeId, int pos, int mode);

/**
Sets visual navigation to <tt>b</tt>. <p>Visual navigation means skipping over hidden text pragraphs. The default is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#visualNavigation() visualNavigation()}, and {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVisualNavigation(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisualNavigation_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setVisualNavigation_boolean(long __this__nativeId, boolean b);

/**
Returns true if the cursor does visual navigation; otherwise returns false. <p>Visual navigation means skipping over hidden text pragraphs. The default is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#setVisualNavigation(boolean) setVisualNavigation()}, and {@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) movePosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean visualNavigation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualNavigation(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_visualNavigation(long __this__nativeId);

/**
@exclude
*/

    public static native QTextCursor fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextCursor(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextCursor array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextCursor)
        return operator_equal((com.trolltech.qt.gui.QTextCursor) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.gui.QTextCursor) {
            if (operator_less((com.trolltech.qt.gui.QTextCursor) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
Returns the selected table cells as a QTableArea.
*/

    public final QTableArea selectedTableCells() {
        QNativePointer firstRow = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer numRows = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer firstColumn = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer numColumns = new QNativePointer(QNativePointer.Type.Int);

        selectedTableCells(firstRow, numRows, firstColumn, numColumns);

        return new QTableArea(firstRow.intValue(), firstColumn.intValue(), numRows.intValue(), numColumns.intValue());
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextCursor clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextCursor __qt_clone(long __this_nativeId);
}
