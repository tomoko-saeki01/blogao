package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextBlock class provides a container for text fragments in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A text block encapsulates a block or paragraph of text in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. QTextBlock provides read-only access to the block/paragraph structure of QTextDocuments. It is mainly of use if you want to implement your own layouts for the visual representation of a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}, or if you want to iterate over a document and write out the contents in your own custom format. <p>Text blocks are created by their parent documents. If you need to create a new text block, or modify the contents of a document while examining its contents, use the cursor-based interface provided by {@link com.trolltech.qt.gui.QTextCursor QTextCursor} instead. <p>Each text block is located at a specific {@link com.trolltech.qt.gui.QTextBlock#position() position()} in a {@link com.trolltech.qt.gui.QTextBlock#document() document()}. The contents of the block can be obtained by using the {@link com.trolltech.qt.gui.QTextBlock#text() text()} function. The {@link com.trolltech.qt.gui.QTextBlock#length() length()} function determines the block's size within the document (including formatting characters). The visual properties of the block are determined by its text {@link com.trolltech.qt.gui.QTextBlock#layout() layout()}, its {@link com.trolltech.qt.gui.QTextBlock#charFormat() charFormat()}, and its {@link com.trolltech.qt.gui.QTextBlock#blockFormat() blockFormat()}. <p>The {@link com.trolltech.qt.gui.QTextBlock#next() next()} and {@link com.trolltech.qt.gui.QTextBlock#previous() previous()} functions enable iteration over consecutive valid blocks in a document under the condition that the document is not modified by other means during the iteration process. Note that, although blocks are returned in sequence, adjacent blocks may come from different places in the document structure. The validity of a block can be determined by calling {@link com.trolltech.qt.gui.QTextBlock#isValid() isValid()}. <p>QTextBlock provides comparison operators to make it easier to work with blocks: operator==() compares two block for equality, operator!=() compares two blocks for inequality, and operator<() determines whether a block precedes another in the same document. <br><center><img src="../images/qtextblock-sequence.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat}, {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}, and {@link com.trolltech.qt.gui.QTextFragment QTextFragment}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextBlock extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTextBlock(){
        super((QPrivateConstructor)null);
        __qt_QTextBlock();
    }

    native void __qt_QTextBlock();

/**
Copies the <tt>other</tt> text block's attributes to this text block.
*/

    public QTextBlock(com.trolltech.qt.gui.QTextBlock o){
        super((QPrivateConstructor)null);
        __qt_QTextBlock_QTextBlock(o == null ? 0 : o.nativeId());
    }

    native void __qt_QTextBlock_QTextBlock(long o);

/**
Returns a text block iterator pointing to the beginning of the text block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#end() end()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock_iterator begin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_begin(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock_iterator __qt_begin(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat} that describes block-specific properties. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#charFormat() charFormat()}. <br></DD></DT>
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
Returns an index into the document's internal list of block formats for the text block's format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#allFormats() QTextDocument::allFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int blockFormatIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockFormatIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_blockFormatIndex(long __this__nativeId);

/**
Returns the number of this block, or -1 if the block is invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#blockNumber() QTextCursor::blockNumber()}. <br></DD></DT>
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
Returns the {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} that describes the block's character format. The block's character format is used when inserting text into an empty block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#blockFormat() blockFormat()}. <br></DD></DT>
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
Returns an index into the document's internal list of character formats for the text block's character format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#allFormats() QTextDocument::allFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int charFormatIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_charFormatIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_charFormatIndex(long __this__nativeId);

/**
Clears the {@link com.trolltech.qt.gui.QTextLayout QTextLayout} that is used to lay out and display the block's contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#layout() layout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearLayout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearLayout(long __this__nativeId);

/**
Returns true if the given <tt>position</tt> is located within the text block; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(int position)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_int(nativeId(), position);
    }
    @QtBlockedSlot
    native boolean __qt_contains_int(long __this__nativeId, int position);

/**
Returns the text document this text block belongs to, or 0 if the text block does not belong to any document.
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
Returns a text block iterator pointing to the end of the text block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#begin() begin()}, {@link com.trolltech.qt.gui.QTextBlock#next() next()}, and {@link com.trolltech.qt.gui.QTextBlock#previous() previous()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock_iterator end()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_end(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock_iterator __qt_end(long __this__nativeId);

/**
Returns the first line number of this block, or -1 if the block is invalid. Unless the layout supports it, the line number is identical to the block number. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#blockNumber() QTextBlock::blockNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int firstLineNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstLineNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_firstLineNumber(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int fragmentIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fragmentIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_fragmentIndex(long __this__nativeId);

/**
Returns true if this text block is valid; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns true if the block is visible; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#setVisible(boolean) setVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isVisible()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisible(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.gui.QTextLayout QTextLayout} that is used to lay out and display the block's contents. <p>Note that the returned {@link com.trolltech.qt.gui.QTextLayout QTextLayout} object can only be modified from the documentChanged implementation of a {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout QAbstractTextDocumentLayout} subclass. Any changes applied from the outside cause undefined behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#clearLayout() clearLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLayout layout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layout(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLayout __qt_layout(long __this__nativeId);

/**
Returns the length of the block in characters. <p><b>Note:</b> The length returned includes all formatting characters, for example, newline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#text() text()}, {@link com.trolltech.qt.gui.QTextBlock#charFormat() charFormat()}, and {@link com.trolltech.qt.gui.QTextBlock#blockFormat() blockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

/**
Returns the line count. Not all document layouts support this feature. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#setLineCount(int) setLineCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lineCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineCount(long __this__nativeId);

/**
Returns the text block in the document after this block, or an empty text block if this is the last one. <p>Note that the next block may be in a different frame or table to this block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#previous() previous()}, {@link com.trolltech.qt.gui.QTextBlock#begin() begin()}, and {@link com.trolltech.qt.gui.QTextBlock#end() end()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock next()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_next(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_next(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.gui.QTextBlock o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QTextBlock(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QTextBlock(long __this__nativeId, long o);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QTextBlock o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextBlock(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextBlock(long __this__nativeId, long o);

/**
Returns the index of the block's first character within the document.
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
Returns the text block in the document before this block, or an empty text block if this is the first one. <p>Note that the next block may be in a different frame or table to this block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#next() next()}, {@link com.trolltech.qt.gui.QTextBlock#begin() begin()}, and {@link com.trolltech.qt.gui.QTextBlock#end() end()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock previous()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previous(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_previous(long __this__nativeId);

/**
Returns the blocks revision. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#setRevision(int) setRevision()}, and {@link com.trolltech.qt.gui.QTextDocument#revision() QTextDocument::revision()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int revision()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_revision(nativeId());
    }
    @QtBlockedSlot
    native int __qt_revision(long __this__nativeId);

/**
Sets the line count to <tt>count</tt>. <p>/sa {@link com.trolltech.qt.gui.QTextBlock#lineCount() lineCount()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#lineCount() lineCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLineCount(int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineCount_int(nativeId(), count);
    }
    @QtBlockedSlot
    native void __qt_setLineCount_int(long __this__nativeId, int count);

/**
Sets a blocks revision to <tt>rev</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#revision() revision()}, and {@link com.trolltech.qt.gui.QTextDocument#revision() QTextDocument::revision()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRevision(int rev)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRevision_int(nativeId(), rev);
    }
    @QtBlockedSlot
    native void __qt_setRevision_int(long __this__nativeId, int rev);

/**
Attaches the given <tt>data</tt> object to the text block. <p>{@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} can be used to store custom settings. The ownership is passed to the underlying text document, i.e. the provided {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} object will be deleted if the corresponding text block gets deleted. The user data object is not stored in the undo history, so it will not be available after undoing the deletion of a text block. <p>For example, if you write a programming editor in an IDE, you may want to let your user set breakpoints visually in your code for an integrated debugger. In a programming editor a line of text usually corresponds to one QTextBlock. The {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} interface allows the developer to store data for each QTextBlock, like for example in which lines of the source code the user has a breakpoint set. Of course this could also be stored externally, but by storing it inside the {@link com.trolltech.qt.gui.QTextDocument QTextDocument}, it will for example be automatically deleted when the user deletes the associated line. It's really just a way to store custom information in the {@link com.trolltech.qt.gui.QTextDocument QTextDocument} without using custom properties in {@link com.trolltech.qt.gui.QTextFormat QTextFormat} which would affect the undo/redo stack. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#userData() userData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserData(com.trolltech.qt.gui.QTextBlockUserData data)    {
        if (data != null) {
            data.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserData_QTextBlockUserData(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUserData_QTextBlockUserData(long __this__nativeId, long data);

/**
Stores the specified <tt>state</tt> integer value in the text block. This may be useful for example in a syntax highlighter to store a text parsing state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#userState() userState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserState(int state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserState_int(nativeId(), state);
    }
    @QtBlockedSlot
    native void __qt_setUserState_int(long __this__nativeId, int state);

/**
Sets the block's visibility to <tt>visible</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#isVisible() isVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVisible(boolean visible)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

/**
Returns the block's contents as plain text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#length() length()}, {@link com.trolltech.qt.gui.QTextBlock#charFormat() charFormat()}, and {@link com.trolltech.qt.gui.QTextBlock#blockFormat() blockFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
If the block represents a list item, returns the list that the item belongs to; otherwise returns 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextList textList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textList(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextList __qt_textList(long __this__nativeId);

/**
Returns a pointer to a {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} object if previously set with {@link com.trolltech.qt.gui.QTextBlock#setUserData(com.trolltech.qt.gui.QTextBlockUserData) setUserData()} or a null pointer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#setUserData(com.trolltech.qt.gui.QTextBlockUserData) setUserData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlockUserData userData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userData(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlockUserData __qt_userData(long __this__nativeId);

/**
Returns the integer value previously set with {@link com.trolltech.qt.gui.QTextBlock#setUserState(int) setUserState()} or -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#setUserState(int) setUserState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int userState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userState(nativeId());
    }
    @QtBlockedSlot
    native int __qt_userState(long __this__nativeId);

/**
@exclude
*/

    public static native QTextBlock fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBlock(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextBlock array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextBlock)
        return operator_equal((com.trolltech.qt.gui.QTextBlock) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.gui.QTextBlock) {
            if (operator_less((com.trolltech.qt.gui.QTextBlock) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextBlock clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextBlock __qt_clone(long __this_nativeId);
}
