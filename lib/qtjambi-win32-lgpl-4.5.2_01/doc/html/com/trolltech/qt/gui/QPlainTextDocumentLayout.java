package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPlainTextDocumentLayout class implements a plain text layout for {@link com.trolltech.qt.gui.QTextDocument QTextDocument} A QPlainTextDocumentLayout is required for text documents that can be display or edited in a {@link com.trolltech.qt.gui.QPlainTextEdit QPlainTextEdit}. See {@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) QTextDocument::setDocumentLayout()}. <p>QPlainTextDocumentLayout uses the {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout QAbstractTextDocumentLayout} API that {@link com.trolltech.qt.gui.QTextDocument QTextDocument} requires, but redefines it partially in order to support plain text better. For instances, it does not operate on vertical pixels, but on paragraphs (called blocks) instead. The height of a document is identical to the number of paragraphs it contains. The layout also doesn't support tables or nested frames, or any sort of advanced text layout that goes beyond a list of paragraphs with syntax highlighting.
*/
@QtJambiGeneratedClass
public class QPlainTextDocumentLayout extends com.trolltech.qt.gui.QAbstractTextDocumentLayout
{

/**
Constructs a plain text document layout for the text <tt>document</tt>.
*/

    public QPlainTextDocumentLayout(com.trolltech.qt.gui.QTextDocument document){
        super((QPrivateConstructor)null);
        __qt_QPlainTextDocumentLayout_QTextDocument(document == null ? 0 : document.nativeId());
    }

    native void __qt_QPlainTextDocumentLayout_QTextDocument(long document);

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
Ensures that <tt>block</tt> has a valid layout
*/

    @QtBlockedSlot
    public final void ensureBlockLayout(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureBlockLayout_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native void __qt_ensureBlockLayout_QTextBlock(long __this__nativeId, long block);

/**
Requests a complete update on all views.
*/

    @QtBlockedSlot
    public final void requestUpdate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_requestUpdate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_requestUpdate(long __this__nativeId);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF blockBoundingRect(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockBoundingRect_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_blockBoundingRect_QTextBlock(long __this__nativeId, long block);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void documentChanged(int from, int arg__2, int charsAdded)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_documentChanged_int_int_int(nativeId(), from, arg__2, charsAdded);
    }
    @QtBlockedSlot
    native void __qt_documentChanged_int_int_int(long __this__nativeId, int from, int arg__2, int charsAdded);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF documentSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_documentSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void draw(com.trolltech.qt.gui.QPainter arg__1, com.trolltech.qt.gui.QAbstractTextDocumentLayout_PaintContext arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_draw_QPainter_QAbstractTextDocumentLayout_PaintContext(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_draw_QPainter_QAbstractTextDocumentLayout_PaintContext(long __this__nativeId, long arg__1, long arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF frameBoundingRect(com.trolltech.qt.gui.QTextFrame arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameBoundingRect_QTextFrame(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_frameBoundingRect_QTextFrame(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int hitTest(com.trolltech.qt.core.QPointF arg__1, com.trolltech.qt.core.Qt.HitTestAccuracy arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hitTest_QPointF_HitTestAccuracy(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2.value());
    }
    @QtBlockedSlot
    native int __qt_hitTest_QPointF_HitTestAccuracy(long __this__nativeId, long arg__1, int arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int pageCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pageCount(long __this__nativeId);

/**
@exclude
*/

    public static native QPlainTextDocumentLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPlainTextDocumentLayout(QPrivateConstructor p) { super(p); } 
}
