package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextBlockGroup class provides a container for text blocks within a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. Block groups can be used to organize blocks of text within a document. They maintain an up-to-date list of the text blocks that belong to them, even when text blocks are being edited. <p>Each group has a parent document which is specified when the group is constructed. <p>Text blocks can be inserted into a group with {@link com.trolltech.qt.gui.QTextBlockGroup#blockInserted(com.trolltech.qt.gui.QTextBlock) blockInserted()}, and removed with {@link com.trolltech.qt.gui.QTextBlockGroup#blockRemoved(com.trolltech.qt.gui.QTextBlock) blockRemoved()}. If a block's format is changed, {@link com.trolltech.qt.gui.QTextBlockGroup#blockFormatChanged(com.trolltech.qt.gui.QTextBlock) blockFormatChanged()} is called. <p>The list of blocks in the group is returned by {@link com.trolltech.qt.gui.QTextBlockGroup#blockList() blockList()}. Note that the blocks in the list are not necessarily adjacent elements in the document; for example, the top-level items in a multi-level list will be separated by the items in lower levels of the list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock QTextBlock}, and {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextBlockGroup extends com.trolltech.qt.gui.QTextObject
{

/**
Creates a new new block group for the given <tt>document</tt>. <p><b>Warning:</b> This function should only be called from {@link com.trolltech.qt.gui.QTextDocument#createObject(com.trolltech.qt.gui.QTextFormat) QTextDocument::createObject()}.
*/

    protected QTextBlockGroup(com.trolltech.qt.gui.QTextDocument doc){
        super((QPrivateConstructor)null);
        __qt_QTextBlockGroup_QTextDocument(doc == null ? 0 : doc.nativeId());
    }

    native void __qt_QTextBlockGroup_QTextDocument(long doc);

/**
Returns a (possibly empty) list of all the blocks that are part of the block group.
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.gui.QTextBlock> blockList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextBlock> __qt_blockList(long __this__nativeId);

/**
This function is called whenever the specified <tt>block</tt> of text is changed. The text block is a member of this group. <p>The base class implementation does nothing.
*/

    @QtBlockedSlot
    protected void blockFormatChanged(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_blockFormatChanged_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native void __qt_blockFormatChanged_QTextBlock(long __this__nativeId, long block);

/**
Appends the given <tt>block</tt> to the end of the group. <p><b>Warning:</b> If you reimplement this function you must call the base class implementation.
*/

    @QtBlockedSlot
    protected void blockInserted(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_blockInserted_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native void __qt_blockInserted_QTextBlock(long __this__nativeId, long block);

/**
Removes the given <tt>block</tt> from the group; the block itself is not deleted, it simply isn't a member of this group anymore.
*/

    @QtBlockedSlot
    protected void blockRemoved(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_blockRemoved_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native void __qt_blockRemoved_QTextBlock(long __this__nativeId, long block);

/**
@exclude
*/

    public static native QTextBlockGroup fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBlockGroup(QPrivateConstructor p) { super(p); } 
}
