package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextFrame class represents a frame in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. Text frames provide structure for the text in a document. They are used as generic containers for other document elements. Frames are usually created by using {@link com.trolltech.qt.gui.QTextCursor#insertFrame(com.trolltech.qt.gui.QTextFrameFormat) QTextCursor::insertFrame()}. <p>Frames can be used to create hierarchical structures in rich text documents. Each document has a root frame ({@link com.trolltech.qt.gui.QTextDocument#rootFrame() QTextDocument::rootFrame()}), and each frame beneath the root frame has a parent frame and a (possibly empty) list of child frames. The parent frame can be found with {@link com.trolltech.qt.gui.QTextFrame#parentFrame() parentFrame()}, and the {@link com.trolltech.qt.gui.QTextFrame#childFrames() childFrames()} function provides a list of child frames. <p>Each frame contains at least one text block to enable text cursors to insert new document elements within. As a result, the QTextFrame::iterator class is used to traverse both the blocks and child frames within a given frame. The first and last child elements in the frame can be found with {@link com.trolltech.qt.gui.QTextFrame#begin() begin()} and {@link com.trolltech.qt.gui.QTextFrame#end() end()}. <p>A frame also has a format (specified using {@link com.trolltech.qt.gui.QTextFrameFormat QTextFrameFormat}) which can be set with {@link com.trolltech.qt.gui.QTextObject#setFormat(com.trolltech.qt.gui.QTextFormat) setFormat()} and read with {@link com.trolltech.qt.gui.QTextObject#format() format()}. <p>Text cursors can be obtained that point to the first and last valid cursor positions within a frame; use the {@link com.trolltech.qt.gui.QTextFrame#firstCursorPosition() firstCursorPosition()} and {@link com.trolltech.qt.gui.QTextFrame#lastCursorPosition() lastCursorPosition()} functions for this. The frame's extent in the document can be found with {@link com.trolltech.qt.gui.QTextFrame#firstPosition() firstPosition()} and {@link com.trolltech.qt.gui.QTextFrame#lastPosition() lastPosition()}. <p>You can iterate over a frame's contents using the QTextFrame::iterator class: this provides read-only access to its internal list of text blocks and child frames. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor QTextCursor}, and {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextFrame extends com.trolltech.qt.gui.QTextObject
{

/**
Creates a new empty frame for the text <tt>document</tt>.
*/

    public QTextFrame(com.trolltech.qt.gui.QTextDocument doc){
        super((QPrivateConstructor)null);
        __qt_QTextFrame_QTextDocument(doc == null ? 0 : doc.nativeId());
    }

    native void __qt_QTextFrame_QTextDocument(long doc);

/**
Returns an iterator pointing to the first document element inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#end() end()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame_iterator begin()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_begin(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame_iterator __qt_begin(long __this__nativeId);

/**
Returns a (possibly empty) list of the frame's child frames. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#parentFrame() parentFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextFrame> childFrames()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childFrames(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextFrame> __qt_childFrames(long __this__nativeId);

/**
Returns an iterator pointing to the last document element inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#begin() begin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame_iterator end()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_end(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame_iterator __qt_end(long __this__nativeId);

/**
Returns the first cursor position inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#lastCursorPosition() lastCursorPosition()}, {@link com.trolltech.qt.gui.QTextFrame#firstPosition() firstPosition()}, and {@link com.trolltech.qt.gui.QTextFrame#lastPosition() lastPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor firstCursorPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstCursorPosition(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_firstCursorPosition(long __this__nativeId);

/**
Returns the first document position inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#lastPosition() lastPosition()}, {@link com.trolltech.qt.gui.QTextFrame#firstCursorPosition() firstCursorPosition()}, and {@link com.trolltech.qt.gui.QTextFrame#lastCursorPosition() lastCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int firstPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_firstPosition(long __this__nativeId);

/**
Returns the frame's format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#setFrameFormat(com.trolltech.qt.gui.QTextFrameFormat) setFrameFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrameFormat frameFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrameFormat __qt_frameFormat(long __this__nativeId);

/**
Returns the last cursor position inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#firstCursorPosition() firstCursorPosition()}, {@link com.trolltech.qt.gui.QTextFrame#firstPosition() firstPosition()}, and {@link com.trolltech.qt.gui.QTextFrame#lastPosition() lastPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor lastCursorPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastCursorPosition(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_lastCursorPosition(long __this__nativeId);

/**
Returns the last document position inside the frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#firstPosition() firstPosition()}, {@link com.trolltech.qt.gui.QTextFrame#firstCursorPosition() firstCursorPosition()}, and {@link com.trolltech.qt.gui.QTextFrame#lastCursorPosition() lastCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lastPosition(long __this__nativeId);

/**
Returns the frame's parent frame. If the frame is the root frame of a document, this will return 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#childFrames() childFrames()}, and {@link com.trolltech.qt.gui.QTextDocument#rootFrame() QTextDocument::rootFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame parentFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_parentFrame(long __this__nativeId);

/**
Sets the frame's <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame#frameFormat() frameFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFrameFormat(com.trolltech.qt.gui.QTextFrameFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameFormat_QTextFrameFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFrameFormat_QTextFrameFormat(long __this__nativeId, long format);

/**
@exclude
*/

    public static native QTextFrame fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextFrame(QPrivateConstructor p) { super(p); } 
}
