package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextList class provides a decorated list of items in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A list contains a sequence of text blocks, each of which is marked with a bullet point or other symbol. Multiple levels of lists can be used, and the automatic numbering feature provides support for ordered numeric and alphabetical lists. <p>Lists are created by using a text cursor to insert an empty list at the current position or by moving existing text into a new list. The {@link com.trolltech.qt.gui.QTextCursor#insertList(com.trolltech.qt.gui.QTextListFormat.Style) QTextCursor::insertList()} function inserts an empty block into the document at the cursor position, and makes it the first item in a list. <pre class="snippet">
    QTextListFormat listFormat = new QTextListFormat();
    if (list != null) {
        listFormat = list.format();
        listFormat.setIndent(listFormat.indent() + 1);
    }

    listFormat.setStyle(QTextListFormat.Style.ListDisc);
    cursor.insertList(listFormat);
</pre> The {@link com.trolltech.qt.gui.QTextCursor#createList(com.trolltech.qt.gui.QTextListFormat.Style) QTextCursor::createList()} function takes the contents of the cursor's current block and turns it into the first item of a new list. <p>The cursor's current list is found with {@link com.trolltech.qt.gui.QTextCursor#currentList() QTextCursor::currentList()}. <p>The number of items in a list is given by {@link com.trolltech.qt.gui.QTextList#count() count()}. Each item can be obtained by its index in the list with the {@link com.trolltech.qt.gui.QTextList#item(int) item()} function. Similarly, the index of a given item can be found with {@link com.trolltech.qt.gui.QTextList#itemNumber(com.trolltech.qt.gui.QTextBlock) itemNumber()}. The text of each item can be found with the {@link com.trolltech.qt.gui.QTextList#itemText(com.trolltech.qt.gui.QTextBlock) itemText()} function. <p>Note that the items in the list may not be adjacent elements in the document. For example, the top-level items in a multi-level list will be separated by the items in lower levels of the list. <p>List items can be deleted by index with the {@link com.trolltech.qt.gui.QTextList#removeItem(int) removeItem()} function. {@link com.trolltech.qt.gui.QTextList#remove(com.trolltech.qt.gui.QTextBlock) remove()} deletes the specified item in the list. <p>The list's format is set with {@link com.trolltech.qt.gui.QTextList#setFormat(com.trolltech.qt.gui.QTextListFormat) setFormat()} and read with format(). The format describes the decoration of the list itself, and not the individual items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock QTextBlock}, {@link com.trolltech.qt.gui.QTextListFormat QTextListFormat}, and {@link com.trolltech.qt.gui.QTextCursor QTextCursor}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextList extends com.trolltech.qt.gui.QTextBlockGroup
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTextList(com.trolltech.qt.gui.QTextDocument doc){
        super((QPrivateConstructor)null);
        __qt_QTextList_QTextDocument(doc == null ? 0 : doc.nativeId());
    }

    native void __qt_QTextList_QTextDocument(long doc);

/**
Makes the given <tt>block</tt> part of the list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextList#remove(com.trolltech.qt.gui.QTextBlock) remove()}, and {@link com.trolltech.qt.gui.QTextList#removeItem(int) removeItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void add(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_add_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native void __qt_add_QTextBlock(long __this__nativeId, long block);

/**
Returns the number of items in the list. <p><DT><b>See also:</b><br><DD>isEmpty(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns the list's format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextList#setFormat(com.trolltech.qt.gui.QTextListFormat) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextListFormat textListFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textListFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextListFormat __qt_textListFormat(long __this__nativeId);

/**
Returns the <tt>i</tt>-th text block in the list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextList#count() count()}, and {@link com.trolltech.qt.gui.QTextList#itemText(com.trolltech.qt.gui.QTextBlock) itemText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock item(int i)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_item_int(long __this__nativeId, int i);

/**
Returns the index of the list item that corresponds to the given <tt>block</tt>. Returns -1 if the block was not present in the list.
*/

    @QtBlockedSlot
    public final int itemNumber(com.trolltech.qt.gui.QTextBlock arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemNumber_QTextBlock(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_itemNumber_QTextBlock(long __this__nativeId, long arg__1);

/**
Returns the text of the list item that corresponds to the given <tt>block</tt>.
*/

    @QtBlockedSlot
    public final java.lang.String itemText(com.trolltech.qt.gui.QTextBlock arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemText_QTextBlock(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_itemText_QTextBlock(long __this__nativeId, long arg__1);

/**
Removes the given <tt>block</tt> from the list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextList#add(com.trolltech.qt.gui.QTextBlock) add()}, and {@link com.trolltech.qt.gui.QTextList#removeItem(int) removeItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void remove(com.trolltech.qt.gui.QTextBlock arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_QTextBlock(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_remove_QTextBlock(long __this__nativeId, long arg__1);

/**
Removes the item at item position <tt>i</tt> from the list. When the last item in the list is removed, the list is automatically deleted by the {@link com.trolltech.qt.gui.QTextDocument QTextDocument} that owns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextList#add(com.trolltech.qt.gui.QTextBlock) add()}, and {@link com.trolltech.qt.gui.QTextList#remove(com.trolltech.qt.gui.QTextBlock) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeItem(int i)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItem_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_removeItem_int(long __this__nativeId, int i);

/**
Sets the list's format to <tt>format</tt>. <p><DT><b>See also:</b><br><DD>format(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.gui.QTextListFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QTextListFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QTextListFormat(long __this__nativeId, long format);

/**
@exclude
*/

    public static native QTextList fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextList(QPrivateConstructor p) { super(p); } 
}
