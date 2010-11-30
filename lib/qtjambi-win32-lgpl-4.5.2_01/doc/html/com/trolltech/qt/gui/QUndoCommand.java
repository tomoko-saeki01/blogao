package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QUndoCommand class is the base class of all commands stored on a {@link com.trolltech.qt.gui.QUndoStack QUndoStack}. For an overview of Qt's Undo Framework, see the {@link <a href="../qundo.html">overview document</a>}. <p>A QUndoCommand represents a single editing action on a document; for example, inserting or deleting a block of text in a text editor. QUndoCommand can apply a change to the document with {@link com.trolltech.qt.gui.QUndoCommand#redo() redo()} and undo the change with {@link com.trolltech.qt.gui.QUndoCommand#undo() undo()}. The implementations for these functions must be provided in a derived class. <pre class="snippet">
    public class AppendText extends QUndoCommand {

        private String m_document;
        private String m_text;

        public AppendText(String doc, String text) {
            m_document = doc;
            m_text= text;
            setText("append text");
        }

        public void undo() {
            m_document = m_document.substring(0,
                    m_document.length() -m_text.length());
        }

        public void redo() {
            m_document += m_text;
        }
    }
</pre> A QUndoCommand has an associated {@link com.trolltech.qt.gui.QUndoCommand#text() text()}. This is a short string describing what the command does. It is used to update the text properties of the stack's undo and redo actions; see {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) QUndoStack::createUndoAction()} and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) QUndoStack::createRedoAction()}. <p>QUndoCommand objects are owned by the stack they were pushed on. {@link com.trolltech.qt.gui.QUndoStack QUndoStack} deletes a command if it has been undone and a new command is pushed. For example: <pre class="snippet">
        MyCommand command1 = new MyCommand();
        stack.push(command1);
        MyCommand command2 = new MyCommand();
        stack.push(command2);

        stack.undo();

        MyCommand command3 = new MyCommand();
        stack.push(command3); // command2 gets deleted
</pre> In effect, when a command is pushed, it becomes the top-most command on the stack. <p>To support command compression, QUndoCommand has an {@link com.trolltech.qt.gui.QUndoCommand#id() id()} and the virtual function {@link com.trolltech.qt.gui.QUndoCommand#mergeWith(com.trolltech.qt.gui.QUndoCommand) mergeWith()}. These functions are used by {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) QUndoStack::push()}. <p>To support command macros, a QUndoCommand object can have any number of child commands. Undoing or redoing the parent command will cause the child commands to be undone or redone. A command can be assigned to a parent explicitly in the constructor. In this case, the command will be owned by the parent. <p>The parent in this case is usually an empty command, in that it doesn't provide its own implementation of {@link com.trolltech.qt.gui.QUndoCommand#undo() undo()} and {@link com.trolltech.qt.gui.QUndoCommand#redo() redo()}. Instead, it uses the base implementations of these functions, which simply call {@link com.trolltech.qt.gui.QUndoCommand#undo() undo()} or {@link com.trolltech.qt.gui.QUndoCommand#redo() redo()} on all its children. The parent should, however, have a meaningful {@link com.trolltech.qt.gui.QUndoCommand#text() text()}. <pre class="snippet">
        QUndoCommand insertRed = new QUndoCommand(); // an empty command
        insertRed.setText("insert red text");

        new InsertText(document, idx, text, insertRed); // becomes child of insertRed
        new SetColor(document, idx, text.length(), Qt.GlobalColor.red, insertRed);

        stack.push(insertRed);
</pre> Another way to create macros is to use the convenience functions {@link com.trolltech.qt.gui.QUndoStack#beginMacro(java.lang.String) QUndoStack::beginMacro()} and {@link com.trolltech.qt.gui.QUndoStack#endMacro() QUndoStack::endMacro()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack QUndoStack}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QUndoCommand extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a QUndoCommand object with parent <tt>parent</tt>. <p>If <tt>parent</tt> is not 0, this command is appended to parent's child list. The parent command then owns this command and will delete it in its destructor. <p><DT><b>See also:</b><br><DD>~QUndoCommand(). <br></DD></DT>
*/

    public QUndoCommand() {
        this((com.trolltech.qt.gui.QUndoCommand)null);
    }
/**
Constructs a QUndoCommand object with parent <tt>parent</tt>. <p>If <tt>parent</tt> is not 0, this command is appended to parent's child list. The parent command then owns this command and will delete it in its destructor. <p><DT><b>See also:</b><br><DD>~QUndoCommand(). <br></DD></DT>
*/

    public QUndoCommand(com.trolltech.qt.gui.QUndoCommand parent){
        super((QPrivateConstructor)null);
        __qt_QUndoCommand_QUndoCommand(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoCommand_QUndoCommand(long parent);


/**
Constructs a QUndoCommand object with the given <tt>parent</tt> and <tt>text</tt>. <p>If <tt>parent</tt> is not 0, this command is appended to parent's child list. The parent command then owns this command and will delete it in its destructor. <p><DT><b>See also:</b><br><DD>~QUndoCommand(). <br></DD></DT>
*/

    public QUndoCommand(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QUndoCommand)null);
    }
/**
Constructs a QUndoCommand object with the given <tt>parent</tt> and <tt>text</tt>. <p>If <tt>parent</tt> is not 0, this command is appended to parent's child list. The parent command then owns this command and will delete it in its destructor. <p><DT><b>See also:</b><br><DD>~QUndoCommand(). <br></DD></DT>
*/

    public QUndoCommand(java.lang.String text, com.trolltech.qt.gui.QUndoCommand parent){
        super((QPrivateConstructor)null);
        __qt_QUndoCommand_String_QUndoCommand(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoCommand_String_QUndoCommand(java.lang.String text, long parent);

/**
Returns the child command at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#childCount() childCount()}, and {@link com.trolltech.qt.gui.QUndoStack#command(int) QUndoStack::command()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QUndoCommand child(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_child_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QUndoCommand __qt_child_int(long __this__nativeId, int index);

/**
Returns the number of child commands in this command. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#child(int) child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int childCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_childCount(long __this__nativeId);

/**
Sets the command's text to be the <tt>text</tt> specified. <p>The specified text should be a short user-readable string describing what this command does. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#text() text()}, {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) QUndoStack::createUndoAction()}, and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) QUndoStack::createRedoAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
Returns a short text string describing what this command does; for example, "insert text". <p>The text is used when the text properties of the stack's undo and redo actions are updated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) QUndoStack::createUndoAction()}, and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) QUndoStack::createRedoAction()}. <br></DD></DT>
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
Returns the ID of this command. <p>A command ID is used in command compression. It must be an integer unique to this command's class, or -1 if the command doesn't support compression. <p>If the command supports compression this function must be overridden in the derived class to return the correct ID. The base implementation returns -1. <p>{@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) QUndoStack::push()} will only try to merge two commands if they have the same ID, and the ID is not -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#mergeWith(com.trolltech.qt.gui.QUndoCommand) mergeWith()}, and {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) QUndoStack::push()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int id()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_id(nativeId());
    }
    @QtBlockedSlot
    native int __qt_id(long __this__nativeId);

/**
Attempts to merge this command with <tt>command</tt>. Returns true on success; otherwise returns false. <p>If this function returns true, calling this command's {@link com.trolltech.qt.gui.QUndoCommand#redo() redo()} must have the same effect as redoing both this command and <tt>command</tt>. Similarly, calling this command's {@link com.trolltech.qt.gui.QUndoCommand#undo() undo()} must have the same effect as undoing <tt>command</tt> and this command. <p>{@link com.trolltech.qt.gui.QUndoStack QUndoStack} will only try to merge two commands if they have the same id, and the id is not -1. <p>The default implementation returns false. <pre class="snippet">
        public boolean mergeWith(QUndoCommand other)
        {
            if (other.id() != id()) // make sure other is also an AppendText command
                return false;
            m_text += ((AppendText)other).m_text;
            return true;
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#id() id()}, and {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) QUndoStack::push()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean mergeWith(com.trolltech.qt.gui.QUndoCommand other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mergeWith_QUndoCommand(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_mergeWith_QUndoCommand(long __this__nativeId, long other);

/**
Applies a change to the document. This function must be implemented in the derived class. Calling {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) QUndoStack::push()}, {@link com.trolltech.qt.gui.QUndoStack#undo() QUndoStack::undo()} or {@link com.trolltech.qt.gui.QUndoStack#redo() QUndoStack::redo()} from this function leads to undefined beahavior. <p>The default implementation calls {@link com.trolltech.qt.gui.QUndoCommand#redo() redo()} on all child commands. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#undo() undo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void redo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    @QtBlockedSlot
    native void __qt_redo(long __this__nativeId);

/**
Reverts a change to the document. After {@link com.trolltech.qt.gui.QUndoCommand#undo() undo()} is called, the state of the document should be the same as before {@link com.trolltech.qt.gui.QUndoCommand#redo() redo()} was called. This function must be implemented in the derived class. Calling {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) QUndoStack::push()}, {@link com.trolltech.qt.gui.QUndoStack#undo() QUndoStack::undo()} or {@link com.trolltech.qt.gui.QUndoStack#redo() QUndoStack::redo()} from this function leads to undefined beahavior. <p>The default implementation calls {@link com.trolltech.qt.gui.QUndoCommand#undo() undo()} on all child commands in reverse order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#redo() redo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void undo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    @QtBlockedSlot
    native void __qt_undo(long __this__nativeId);

/**
@exclude
*/

    public static native QUndoCommand fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QUndoCommand(QPrivateConstructor p) { super(p); } 
}
