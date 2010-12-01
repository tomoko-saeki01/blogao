package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractTextDocumentLayout class is an abstract base class used to implement custom layouts for QTextDocuments. The standard layout provided by Qt can handle simple word processing including inline images, lists and tables. <p>Some applications, e.g., a word processor or a DTP application might need more features than the ones provided by Qt's layout engine, in which case you can subclass QAbstractTextDocumentLayout to provide custom layout behavior for your text documents. <p>An instance of the QAbstractTextDocumentLayout subclass can be installed on a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} object with the {@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) setDocumentLayout()} function. <p>You can insert custom objects into a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}; see the {@link com.trolltech.qt.gui.QTextObjectInterface QTextObjectInterface} class description for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextObjectInterface QTextObjectInterface}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractTextDocumentLayout extends com.trolltech.qt.core.QObject
{

    private Object __rcPaintDevice = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractTextDocumentLayout {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QRectF blockBoundingRect(com.trolltech.qt.gui.QTextBlock block) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_blockBoundingRect_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
        }

        @Override
        @QtBlockedSlot
        protected void documentChanged(int from, int charsRemoved, int charsAdded) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_documentChanged_int_int_int(nativeId(), from, charsRemoved, charsAdded);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QSizeF documentSize() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_documentSize(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void draw(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QAbstractTextDocumentLayout_PaintContext context) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_draw_QPainter_QAbstractTextDocumentLayout_PaintContext(nativeId(), painter == null ? 0 : painter.nativeId(), context == null ? 0 : context.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QRectF frameBoundingRect(com.trolltech.qt.gui.QTextFrame frame) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_frameBoundingRect_QTextFrame(nativeId(), frame == null ? 0 : frame.nativeId());
        }

        @Override
        @QtBlockedSlot
        public int hitTest(com.trolltech.qt.core.QPointF point, com.trolltech.qt.core.Qt.HitTestAccuracy accuracy) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hitTest_QPointF_HitTestAccuracy(nativeId(), point == null ? 0 : point.nativeId(), accuracy.value());
        }

        @Override
        @QtBlockedSlot
        public int pageCount() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_pageCount(nativeId());
        }
    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QSizeF(named: newSize)&gt;:<p> This signal is emitted when the size of the document layout changes to <tt>newSize</tt>. <p>Subclasses of QAbstractTextDocumentLayout should emit this signal when the document's entire layout size changes. This signal is useful for widgets that display text documents since it enables them to update their scroll bars correctly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#documentSize() documentSize()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QSizeF> documentSizeChanged = new Signal1<com.trolltech.qt.core.QSizeF>();

    private final void documentSizeChanged(com.trolltech.qt.core.QSizeF newSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_documentSizeChanged_QSizeF(nativeId(), newSize == null ? 0 : newSize.nativeId());
    }
    native void __qt_documentSizeChanged_QSizeF(long __this__nativeId, long newSize);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: newPages)&gt;:<p> This signal is emitted when the number of pages in the layout changes; <tt>newPages</tt> is the updated page count. <p>Subclasses of QAbstractTextDocumentLayout should emit this signal when the number of pages in the layout has changed. Changes to the page count are caused by changes to the layout or the document content itself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#pageCount() pageCount()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> pageCountChanged = new Signal1<java.lang.Integer>();

    private final void pageCountChanged(int newPages)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pageCountChanged_int(nativeId(), newPages);
    }
    native void __qt_pageCountChanged_int(long __this__nativeId, int newPages);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QRectF(named: rect)&gt;:<p> This signal is emitted when the rectangle <tt>rect</tt> has been updated. <p>Subclasses of QAbstractTextDocumentLayout should emit this signal when the layout of the contents change in order to repaint.
*/

    public final Signal1<com.trolltech.qt.core.QRectF> update = new Signal1<com.trolltech.qt.core.QRectF>();


    private final void update() {
        update((com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(0., 0., 1000000000., 1000000000.));
    }
    private final void update(com.trolltech.qt.core.QRectF arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_QRectF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_update_QRectF(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTextBlock(named: rect)&gt;:<p> This signal is emitted when the rectangle <tt>rect</tt> has been updated. <p>Subclasses of QAbstractTextDocumentLayout should emit this signal when the layout of the contents change in order to repaint.
*/

    public final Signal1<com.trolltech.qt.gui.QTextBlock> updateBlock = new Signal1<com.trolltech.qt.gui.QTextBlock>();

    private final void updateBlock(com.trolltech.qt.gui.QTextBlock block)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateBlock_QTextBlock(nativeId(), block == null ? 0 : block.nativeId());
    }
    native void __qt_updateBlock_QTextBlock(long __this__nativeId, long block);

/**
Creates a new text document layout for the given <tt>document</tt>.
*/

    public QAbstractTextDocumentLayout(com.trolltech.qt.gui.QTextDocument doc){
        super((QPrivateConstructor)null);
        __qt_QAbstractTextDocumentLayout_QTextDocument(doc == null ? 0 : doc.nativeId());
    }

    native void __qt_QAbstractTextDocumentLayout_QTextDocument(long doc);

/**
Returns the reference of the anchor the given <tt>position</tt>, or an empty string if no anchor exists at that point.
*/

    @QtBlockedSlot
    public final java.lang.String anchorAt(com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_anchorAt_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_anchorAt_QPointF(long __this__nativeId, long pos);

/**
Returns the text document that this layout is operating on.
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
Returns the character format that is applicable at the given <tt>position</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTextCharFormat format(int pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_format_int(long __this__nativeId, int pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int formatIndex(int pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_formatIndex_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native int __qt_formatIndex_int(long __this__nativeId, int pos);

/**
Returns the paint device used to render the document's layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#setPaintDevice(com.trolltech.qt.gui.QPaintDeviceInterface) setPaintDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPaintDeviceInterface paintDevice()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintDeviceInterface __qt_paintDevice(long __this__nativeId);

/**
Registers the given <tt>component</tt> as a handler for items of the given <tt>objectType</tt>. <p><b>Note:</b>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#registerHandler(int, com.trolltech.qt.core.QObject) registerHandler()} has to be called once for each object type. This means that there is only one handler for multiple replacement characters of the same object type.
*/

    @Deprecated
    @QtBlockedSlot
    public final void registerHandler(int objectType, com.trolltech.qt.core.QObject component)    {
        if (!(component instanceof QTextObjectInterface)) {
            throw new IllegalArgumentException("Handler object must be of class QTextObjectInterface");
        }


        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_registerHandler_int_QObject(nativeId(), objectType, component == null ? 0 : component.nativeId());
    }
    @Deprecated
    @QtBlockedSlot
    native void __qt_registerHandler_int_QObject(long __this__nativeId, int objectType, long component);

/**
Sets the paint device used for rendering the document's layout to the given <tt>device</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#paintDevice() paintDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPaintDevice(com.trolltech.qt.gui.QPaintDeviceInterface device)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcPaintDevice = device;
        }
        __qt_setPaintDevice_QPaintDevice(nativeId(), device == null ? 0 : device.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPaintDevice_QPaintDevice(long __this__nativeId, long device);

/**
Returns the bounding rectangle of <tt>block</tt>.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QRectF blockBoundingRect(com.trolltech.qt.gui.QTextBlock block);
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_blockBoundingRect_QTextBlock(long __this__nativeId, long block);

/**
This function is called whenever the contents of the document change. A change occurs when text is inserted, removed, or a combination of these two. The change is specified by <tt>position</tt>, <tt>charsRemoved</tt>, and <tt>charsAdded</tt> corresponding to the starting character position of the change, the number of characters removed from the document, and the number of characters added. <p>For example, when inserting the text "Hello" into an empty document, <tt>charsRemoved</tt> would be 0 and <tt>charsAdded</tt> would be 5 (the length of the string). <p>Replacing text is a combination of removing and inserting. For example, if the text "Hello" gets replaced by "Hi", <tt>charsRemoved</tt> would be 5 and <tt>charsAdded</tt> would be 2. <p>For subclasses of QAbstractTextDocumentLayout, this is the central function where a large portion of the work to lay out and position document contents is done. <p>For example, in a subclass that only arranges blocks of text, an implementation of this function would have to do the following: <ul><li> Determine the list of changed {@link com.trolltech.qt.gui.QTextBlock QTextBlock}(s) using the parameters provided.</li><li> Each {@link com.trolltech.qt.gui.QTextBlock QTextBlock} object's corresponding {@link com.trolltech.qt.gui.QTextLayout QTextLayout} object needs to be processed. You can access the {@link com.trolltech.qt.gui.QTextBlock QTextBlock}'s layout using the {@link com.trolltech.qt.gui.QTextBlock#layout() QTextBlock::layout()} function. This processing should take the document's page size into consideration.</li><li> If the total number of pages changed, the {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#pageCountChanged pageCountChanged() } signal should be emitted.</li><li> If the total size changed, the {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#documentSizeChanged documentSizeChanged() } signal should be emitted.</li><li> The {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#update update() } signal should be emitted to schedule a repaint of areas in the layout that require repainting.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout QTextLayout}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract void documentChanged(int from, int charsRemoved, int charsAdded);
    @QtBlockedSlot
    native void __qt_documentChanged_int_int_int(long __this__nativeId, int from, int charsRemoved, int charsAdded);

/**
Returns the total size of the document's layout. <p>This information can be used by display widgets to update their scroll bars correctly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#documentSizeChanged documentSizeChanged() }, and {@link QTextDocument#pageSize() QTextDocument::pageSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QSizeF documentSize();
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_documentSize(long __this__nativeId);

/**
Draws the layout with the given <tt>painter</tt> using the given <tt>context</tt>.
*/

    @QtBlockedSlot
    public abstract void draw(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QAbstractTextDocumentLayout_PaintContext context);
    @QtBlockedSlot
    native void __qt_draw_QPainter_QAbstractTextDocumentLayout_PaintContext(long __this__nativeId, long painter, long context);

/**
This function is called to draw the inline object, <tt>object</tt>, with the given <tt>painter</tt> within the rectangle specified by <tt>rect</tt> using the specified text <tt>format</tt>. <p><tt>posInDocument</tt> specifies the position of the object within the document. <p>The default implementation calls drawObject() on the object handlers. This function is called only within Qt. Subclasses can reimplement this function to customize the drawing of inline objects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#draw(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QAbstractTextDocumentLayout_PaintContext) draw()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void drawInlineObject(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QTextInlineObject object, int posInDocument, com.trolltech.qt.gui.QTextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawInlineObject_QPainter_QRectF_QTextInlineObject_int_QTextFormat(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), object == null ? 0 : object.nativeId(), posInDocument, format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawInlineObject_QPainter_QRectF_QTextInlineObject_int_QTextFormat(long __this__nativeId, long painter, long rect, long object, int posInDocument, long format);

/**
Returns the bounding rectangle of <tt>frame</tt>.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QRectF frameBoundingRect(com.trolltech.qt.gui.QTextFrame frame);
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_frameBoundingRect_QTextFrame(long __this__nativeId, long frame);

/**
Returns the cursor postion for the given <tt>point</tt> with the specified <tt>accuracy</tt>. Returns -1 if no valid cursor position was found.
*/

    @QtBlockedSlot
    public abstract int hitTest(com.trolltech.qt.core.QPointF point, com.trolltech.qt.core.Qt.HitTestAccuracy accuracy);
    @QtBlockedSlot
    native int __qt_hitTest_QPointF_HitTestAccuracy(long __this__nativeId, long point, int accuracy);

/**
Returns the number of pages contained in the layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#pageCountChanged pageCountChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int pageCount();
    @QtBlockedSlot
    native int __qt_pageCount(long __this__nativeId);

/**
Lays out the inline object <tt>item</tt> using the given text <tt>format</tt>. <p><tt>posInDocument</tt> specifies the position of the object within the document. <p>The default implementation does nothing. This function is called only within Qt. Subclasses can reimplement this function to customize the position of inline objects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#drawInlineObject(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QTextInlineObject, int, com.trolltech.qt.gui.QTextFormat) drawInlineObject()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void positionInlineObject(com.trolltech.qt.gui.QTextInlineObject item, int posInDocument, com.trolltech.qt.gui.QTextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_positionInlineObject_QTextInlineObject_int_QTextFormat(nativeId(), item == null ? 0 : item.nativeId(), posInDocument, format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_positionInlineObject_QTextInlineObject_int_QTextFormat(long __this__nativeId, long item, int posInDocument, long format);

/**
Sets the size of the inline object <tt>item</tt> corresponding to the text <tt>format</tt>. <p><tt>posInDocument</tt> specifies the position of the object within the document. <p>The default implementation resizes the <tt>item</tt> to the size returned by the object handler's intrinsicSize() function. This function is called only within Qt. Subclasses can reimplement this function to customize the resizing of inline objects.
*/

    @QtBlockedSlot
    protected void resizeInlineObject(com.trolltech.qt.gui.QTextInlineObject item, int posInDocument, com.trolltech.qt.gui.QTextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeInlineObject_QTextInlineObject_int_QTextFormat(nativeId(), item == null ? 0 : item.nativeId(), posInDocument, format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeInlineObject_QTextInlineObject_int_QTextFormat(long __this__nativeId, long item, int posInDocument, long format);

/**
@exclude
*/

    public static native QAbstractTextDocumentLayout fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractTextDocumentLayout(QPrivateConstructor p) { super(p); } 

    // Injected methods
/**
Returns a handler for objects of the given <tt>objectType</tt>.
*/

    public final QTextObjectInterface handlerForObject(int objectType) {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handlerForObject(nativeId(), objectType);
    }
    native QTextObjectInterface __qt_handlerForObject(long __this__nativeId, int objectType);

    /**
     * Registers the given component as a handler for items of the given objectType.
     * Note: registerHandler() has to be called once for each object type. This means that there is only one handler for multiple replacement characters of the same object type.
     *
     * @param objectType The type for which to register a handler.
     * @param component The handler for the given type.
     **/
    @SuppressWarnings("deprecated")
    public final void registerHandler(int objectType, QTextObjectInterface component) {
        registerHandler(objectType, (com.trolltech.qt.core.QObject) component);
    }

}
