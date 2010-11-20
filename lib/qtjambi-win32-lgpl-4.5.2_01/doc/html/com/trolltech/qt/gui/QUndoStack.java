package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QUndoStack class is a stack of {@link com.trolltech.qt.gui.QUndoCommand QUndoCommand} objects. For an overview of Qt's Undo Framework, see the {@link <a href="../qundo.html">overview document</a>}. <p>An undo stack maintains a stack of commands that have been applied to a document. <p>New commands are pushed on the stack using {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) push()}. Commands can be undone and redone using {@link com.trolltech.qt.gui.QUndoStack#undo() undo()} and {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}, or by triggering the actions returned by {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()} and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}. <p>QUndoStack keeps track of the <tt>current</tt> command. This is the command which will be executed by the next call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. The index of this command is returned by {@link com.trolltech.qt.gui.QUndoStack#index() index()}. The state of the edited object can be rolled forward or back using {@link com.trolltech.qt.gui.QUndoStack#setIndex(int) setIndex()}. If the top-most command on the stack has already been redone, {@link com.trolltech.qt.gui.QUndoStack#index() index()} is equal to {@link com.trolltech.qt.gui.QUndoStack#count() count()}. <p>QUndoStack provides support for undo and redo actions, command compression, command macros, and supports the concept of a clean state.<a name="undo-and-redo-actions"><h2>Undo and Redo Actions</h2> QUndoStack provides convenient undo and redo {@link com.trolltech.qt.gui.QAction QAction} objects, which can be inserted into a menu or a toolbar. When commands are undone or redone, QUndoStack updates the text properties of these actions to reflect what change they will trigger. The actions are also disabled when no command is available for undo or redo. These actions are returned by {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) QUndoStack::createUndoAction()} and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) QUndoStack::createRedoAction()}.<a name="command-compression-and-macros"><h2>Command Compression and Macros</h2> Command compression is useful when several commands can be compressed into a single command that can be undone and redone in a single operation. For example, when a user types a character in a text editor, a new command is created. This command inserts the character into the document at the cursor position. However, it is more convenient for the user to be able to undo or redo typing of whole words, sentences, or paragraphs. Command compression allows these single-character commands to be merged into a single command which inserts or deletes sections of text. For more information, see {@link com.trolltech.qt.gui.QUndoCommand#mergeWith(com.trolltech.qt.gui.QUndoCommand) QUndoCommand::mergeWith()} and {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) push()}. <p>A command macro is a sequence of commands, all of which are undone and redone in one go. Command macros are created by giving a command a list of child commands. Undoing or redoing the parent command will cause the child commands to be undone or redone. Command macros may be created explicitly by specifying a parent in the {@link com.trolltech.qt.gui.QUndoCommand QUndoCommand} constructor, or by using the convenience functions {@link com.trolltech.qt.gui.QUndoStack#beginMacro(java.lang.String) beginMacro()} and {@link com.trolltech.qt.gui.QUndoStack#endMacro() endMacro()}. <p>Although command compression and macros appear to have the same effect to the user, they often have different uses in an application. Commands that perform small changes to a document may be usefully compressed if there is no need to individually record them, and if only larger changes are relevant to the user. However, for commands that need to be recorded individually, or those that cannot be compressed, it is useful to use macros to provide a more convenient user experience while maintaining a record of each command.<a name="clean-state"><h2>Clean State</h2> QUndoStack supports the concept of a clean state. When the document is saved to disk, the stack can be marked as clean using {@link com.trolltech.qt.gui.QUndoStack#setClean() setClean()}. Whenever the stack returns to this state through undoing and redoing commands, it emits the signal {@link com.trolltech.qt.gui.QUndoStack#cleanChanged cleanChanged() }. This signal is also emitted when the stack leaves the clean state. This signal is usually used to enable and disable the save actions in the application, and to update the document's title to reflect that it contains unsaved changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand QUndoCommand}, and {@link com.trolltech.qt.gui.QUndoView QUndoView}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QUndoStack extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: canRedo)&gt;:<p> This signal is emitted whenever the value of {@link com.trolltech.qt.gui.QUndoStack#canRedo() canRedo()} changes. It is used to enable or disable the redo action returned by {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}. <tt>canRedo</tt> specifies the new value.
*/

    public final Signal1<java.lang.Boolean> canRedoChanged = new Signal1<java.lang.Boolean>();

    private final void canRedoChanged(boolean canRedo)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_canRedoChanged_boolean(nativeId(), canRedo);
    }
    native void __qt_canRedoChanged_boolean(long __this__nativeId, boolean canRedo);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: canUndo)&gt;:<p> This signal is emitted whenever the value of {@link com.trolltech.qt.gui.QUndoStack#canUndo() canUndo()} changes. It is used to enable or disable the undo action returned by {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()}. <tt>canUndo</tt> specifies the new value.
*/

    public final Signal1<java.lang.Boolean> canUndoChanged = new Signal1<java.lang.Boolean>();

    private final void canUndoChanged(boolean canUndo)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_canUndoChanged_boolean(nativeId(), canUndo);
    }
    native void __qt_canUndoChanged_boolean(long __this__nativeId, boolean canUndo);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: clean)&gt;:<p> This signal is emitted whenever the stack enters or leaves the clean state. If <tt>clean</tt> is true, the stack is in a clean state; otherwise this signal indicates that it has left the clean state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#isClean() isClean()}, and {@link com.trolltech.qt.gui.QUndoStack#setClean() setClean()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> cleanChanged = new Signal1<java.lang.Boolean>();

    private final void cleanChanged(boolean clean)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cleanChanged_boolean(nativeId(), clean);
    }
    native void __qt_cleanChanged_boolean(long __this__nativeId, boolean clean);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: idx)&gt;:<p> This signal is emitted whenever a command modifies the state of the document. This happens when a command is undone or redone. When a macro command is undone or redone, or {@link com.trolltech.qt.gui.QUndoStack#setIndex(int) setIndex()} is called, this signal is emitted only once. <p><tt>idx</tt> specifies the index of the current command, ie. the command which will be executed on the next call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#index() index()}, and {@link com.trolltech.qt.gui.QUndoStack#setIndex(int) setIndex()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> indexChanged = new Signal1<java.lang.Integer>();

    private final void indexChanged(int idx)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_indexChanged_int(nativeId(), idx);
    }
    native void __qt_indexChanged_int(long __this__nativeId, int idx);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: redoText)&gt;:<p> This signal is emitted whenever the value of {@link com.trolltech.qt.gui.QUndoStack#redoText() redoText()} changes. It is used to update the text property of the redo action returned by {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}. <tt>redoText</tt> specifies the new text.
*/

    public final Signal1<java.lang.String> redoTextChanged = new Signal1<java.lang.String>();

    private final void redoTextChanged(java.lang.String redoText)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redoTextChanged_String(nativeId(), redoText);
    }
    native void __qt_redoTextChanged_String(long __this__nativeId, java.lang.String redoText);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: undoText)&gt;:<p> This signal is emitted whenever the value of {@link com.trolltech.qt.gui.QUndoStack#undoText() undoText()} changes. It is used to update the text property of the undo action returned by {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()}. <tt>undoText</tt> specifies the new text.
*/

    public final Signal1<java.lang.String> undoTextChanged = new Signal1<java.lang.String>();

    private final void undoTextChanged(java.lang.String undoText)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undoTextChanged_String(nativeId(), undoText);
    }
    native void __qt_undoTextChanged_String(long __this__nativeId, java.lang.String undoText);


/**
Constructs an empty undo stack with the parent <tt>parent</tt>. The stack will initally be in the clean state. If <tt>parent</tt> is a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup} object, the stack is automatically added to the group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) push()}. <br></DD></DT>
*/

    public QUndoStack() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an empty undo stack with the parent <tt>parent</tt>. The stack will initally be in the clean state. If <tt>parent</tt> is a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup} object, the stack is automatically added to the group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) push()}. <br></DD></DT>
*/

    public QUndoStack(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QUndoStack_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoStack_QObject(long parent);

/**
Begins composition of a macro command with the given <tt>text</tt> description. <p>An empty command described by the specified <tt>text</tt> is pushed on the stack. Any subsequent commands pushed on the stack will be appended to the empty command's children until {@link com.trolltech.qt.gui.QUndoStack#endMacro() endMacro()} is called. <p>Calls to {@link com.trolltech.qt.gui.QUndoStack#beginMacro(java.lang.String) beginMacro()} and {@link com.trolltech.qt.gui.QUndoStack#endMacro() endMacro()} may be nested, but every call to {@link com.trolltech.qt.gui.QUndoStack#beginMacro(java.lang.String) beginMacro()} must have a matching call to {@link com.trolltech.qt.gui.QUndoStack#endMacro() endMacro()}. <p>While a macro is composed, the stack is disabled. This means that: <ul><li> {@link com.trolltech.qt.gui.QUndoStack#indexChanged indexChanged() } and {@link com.trolltech.qt.gui.QUndoStack#cleanChanged cleanChanged() } are not emitted,</li><li> {@link com.trolltech.qt.gui.QUndoStack#canUndo() canUndo()} and {@link com.trolltech.qt.gui.QUndoStack#canRedo() canRedo()} return false,</li><li> calling {@link com.trolltech.qt.gui.QUndoStack#undo() undo()} or {@link com.trolltech.qt.gui.QUndoStack#redo() redo()} has no effect,</li><li> the undo/redo actions are disabled.</li></ul> The stack becomes enabled and appropriate signals are emitted when {@link com.trolltech.qt.gui.QUndoStack#endMacro() endMacro()} is called for the outermost macro. <pre class="snippet">
        stack.beginMacro("insert red text");
        stack.push(new InsertText(document, idx, text));
        stack.push(new SetColor(document, idx, text.length(), Qt.GlobalColor.red));
        stack.endMacro(); // indexChanged() is emitted
</pre> This code is equivalent to: <pre class="snippet">
        QUndoCommand nsertRed = new QUndoCommand(); // an empty command
        insertRed.setText("insert red text");

        new InsertText(document, idx, text, insertRed); // becomes child of insertRed
        new SetColor(document, idx, text.length(), Qt.GlobalColor.red, insertRed);

        stack.push(insertRed);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#endMacro() endMacro()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void beginMacro(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginMacro_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_beginMacro_String(long __this__nativeId, java.lang.String text);

/**
Returns true if there is a command available for redo; otherwise returns false. <p>This function returns false if the stack is empty or if the top command on the stack has already been redone. <p>Synonymous with {@link com.trolltech.qt.gui.QUndoStack#index() index()} == {@link com.trolltech.qt.gui.QUndoStack#count() count()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#index() index()}, and {@link com.trolltech.qt.gui.QUndoStack#canUndo() canUndo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean canRedo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canRedo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canRedo(long __this__nativeId);

/**
Returns true if there is a command available for undo; otherwise returns false. <p>This function returns false if the stack is empty, or if the bottom command on the stack has already been undone. <p>Synonymous with {@link com.trolltech.qt.gui.QUndoStack#index() index()} == 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#index() index()}, and {@link com.trolltech.qt.gui.QUndoStack#canRedo() canRedo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean canUndo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canUndo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canUndo(long __this__nativeId);

/**
Returns the clean index. This is the index at which {@link com.trolltech.qt.gui.QUndoStack#setClean() setClean()} was called. <p>A stack may not have a clean index. This happens if a document is saved, some commands are undone, then a new command is pushed. Since {@link com.trolltech.qt.gui.QUndoStack#push(com.trolltech.qt.gui.QUndoCommand) push()} deletes all the undone commands before pushing the new command, the stack can't return to the clean state again. In this case, this function returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#isClean() isClean()}, and {@link com.trolltech.qt.gui.QUndoStack#setClean() setClean()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int cleanIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cleanIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_cleanIndex(long __this__nativeId);

/**
Clears the command stack by deleting all commands on it, and returns the stack to the clean state. <p>Commands are not undone or redone; the state of the edited object remains unchanged. <p>This function is usually used when the contents of the document are abandoned. <p><DT><b>See also:</b><br><DD>QUndoStack(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns a const pointer to the command at <tt>index</tt>. <p>This function returns a const pointer, because modifying a command, once it has been pushed onto the stack and executed, almost always causes corruption of the state of the document, if the command is later undone or redone. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#child(int) QUndoCommand::child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QUndoCommand command(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_command_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QUndoCommand __qt_command_int(long __this__nativeId, int index);

/**
Returns the number of commands on the stack. Macro commands are counted as one command. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#index() index()}, {@link com.trolltech.qt.gui.QUndoStack#setIndex(int) setIndex()}, and {@link com.trolltech.qt.gui.QUndoStack#command(int) command()}. <br></DD></DT>
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
Creates an redo {@link com.trolltech.qt.gui.QAction QAction} object with the given <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. The text of this action is the text of the command which will be redone in the next call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}, prefixed by the specified <tt>prefix</tt>. If there is no command available for redo, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Redo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()}, {@link com.trolltech.qt.gui.QUndoStack#canRedo() canRedo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction createRedoAction(com.trolltech.qt.core.QObject parent) {
        return createRedoAction(parent, (java.lang.String)null);
    }
/**
Creates an redo {@link com.trolltech.qt.gui.QAction QAction} object with the given <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. The text of this action is the text of the command which will be redone in the next call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}, prefixed by the specified <tt>prefix</tt>. If there is no command available for redo, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Redo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()}, {@link com.trolltech.qt.gui.QUndoStack#canRedo() canRedo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction createRedoAction(com.trolltech.qt.core.QObject parent, java.lang.String prefix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createRedoAction_QObject_String(nativeId(), parent == null ? 0 : parent.nativeId(), prefix);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_createRedoAction_QObject_String(long __this__nativeId, long parent, java.lang.String prefix);


/**
Creates an undo {@link com.trolltech.qt.gui.QAction QAction} object with the given <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}. The text of this action is the text of the command which will be undone in the next call to {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}, prefixed by the specified <tt>prefix</tt>. If there is no command available for undo, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Undo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}, {@link com.trolltech.qt.gui.QUndoStack#canUndo() canUndo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction createUndoAction(com.trolltech.qt.core.QObject parent) {
        return createUndoAction(parent, (java.lang.String)null);
    }
/**
Creates an undo {@link com.trolltech.qt.gui.QAction QAction} object with the given <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}. The text of this action is the text of the command which will be undone in the next call to {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}, prefixed by the specified <tt>prefix</tt>. If there is no command available for undo, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Undo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}, {@link com.trolltech.qt.gui.QUndoStack#canUndo() canUndo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction createUndoAction(com.trolltech.qt.core.QObject parent, java.lang.String prefix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createUndoAction_QObject_String(nativeId(), parent == null ? 0 : parent.nativeId(), prefix);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_createUndoAction_QObject_String(long __this__nativeId, long parent, java.lang.String prefix);

/**
Ends composition of a macro command. <p>If this is the outermost macro in a set nested macros, this function emits {@link com.trolltech.qt.gui.QUndoStack#indexChanged indexChanged() } once for the entire macro command. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#beginMacro(java.lang.String) beginMacro()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void endMacro()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endMacro(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endMacro(long __this__nativeId);

/**
Returns the index of the current command. This is the command that will be executed on the next call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. It is not always the top-most command on the stack, since a number of commands may have been undone. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#setIndex(int) setIndex()}, {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}, {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}, and {@link com.trolltech.qt.gui.QUndoStack#count() count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int index()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index(nativeId());
    }
    @QtBlockedSlot
    native int __qt_index(long __this__nativeId);

/**
This property holds the active status of this stack.  An application often has multiple undo stacks, one for each opened document. The active stack is the one associated with the currently active document. If the stack belongs to a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, calls to {@link com.trolltech.qt.gui.QUndoGroup#undo() QUndoGroup::undo()} or {@link com.trolltech.qt.gui.QUndoGroup#redo() QUndoGroup::redo()} will be forwarded to this stack when it is active. If the {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup} is watched by a {@link com.trolltech.qt.gui.QUndoView QUndoView}, the view will display the contents of this stack when it is active. If the stack does not belong to a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, making it active has no effect. <p>It is the programmer's responsibility to specify which stack is active by calling {@link com.trolltech.qt.gui.QUndoStack#setActive() setActive()}, usually when the associated document window receives focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="active")
    @QtBlockedSlot
    public final boolean isActive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActive(long __this__nativeId);

/**
If the stack is in the clean state, returns true; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#setClean() setClean()}, and {@link com.trolltech.qt.gui.QUndoStack#cleanIndex() cleanIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isClean()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isClean(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isClean(long __this__nativeId);

/**
Pushes <tt>cmd</tt> on the stack or merges it with the most recently executed command. In either case, executes <tt>cmd</tt> by calling its {@link com.trolltech.qt.gui.QUndoStack#redo() redo()} function. <p>If <tt>cmd</tt>'s id is not -1, and if the id is the same as that of the most recently executed command, QUndoStack will attempt to merge the two commands by calling {@link com.trolltech.qt.gui.QUndoCommand#mergeWith(com.trolltech.qt.gui.QUndoCommand) QUndoCommand::mergeWith()} on the most recently executed command. If {@link com.trolltech.qt.gui.QUndoCommand#mergeWith(com.trolltech.qt.gui.QUndoCommand) QUndoCommand::mergeWith()} returns true, <tt>cmd</tt> is deleted. <p>In all other cases <tt>cmd</tt> is simply pushed on the stack. <p>If commands were undone before <tt>cmd</tt> was pushed, the current command and all commands above it are deleted. Hence <tt>cmd</tt> always ends up being the top-most on the stack. <p>Once a command is pushed, the stack takes ownership of it. There are no getters to return the command, since modifying it after it has been executed will almost always lead to corruption of the document's state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#id() QUndoCommand::id()}, and {@link com.trolltech.qt.gui.QUndoCommand#mergeWith(com.trolltech.qt.gui.QUndoCommand) QUndoCommand::mergeWith()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void push(com.trolltech.qt.gui.QUndoCommand cmd)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (cmd != null) {
            cmd.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_QUndoCommand(nativeId(), cmd == null ? 0 : cmd.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_QUndoCommand(long __this__nativeId, long cmd);

/**
Redoes the current command by calling {@link com.trolltech.qt.gui.QUndoCommand#redo() QUndoCommand::redo()}. Increments the current command index. <p>If the stack is empty, or if the top command on the stack has already been redone, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#undo() undo()}, and {@link com.trolltech.qt.gui.QUndoStack#index() index()}. <br></DD></DT>
*/

    public final void redo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    native void __qt_redo(long __this__nativeId);

/**
Returns the text of the command which will be redone in the next call to {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}, and {@link com.trolltech.qt.gui.QUndoStack#undoText() undoText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String redoText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_redoText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_redoText(long __this__nativeId);


/**
This property holds the active status of this stack.  An application often has multiple undo stacks, one for each opened document. The active stack is the one associated with the currently active document. If the stack belongs to a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, calls to {@link com.trolltech.qt.gui.QUndoGroup#undo() QUndoGroup::undo()} or {@link com.trolltech.qt.gui.QUndoGroup#redo() QUndoGroup::redo()} will be forwarded to this stack when it is active. If the {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup} is watched by a {@link com.trolltech.qt.gui.QUndoView QUndoView}, the view will display the contents of this stack when it is active. If the stack does not belong to a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, making it active has no effect. <p>It is the programmer's responsibility to specify which stack is active by calling {@link com.trolltech.qt.gui.QUndoStack#setActive() setActive()}, usually when the associated document window receives focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}. <br></DD></DT>
*/

    public final void setActive() {
        setActive((boolean)true);
    }
/**
This property holds the active status of this stack.  An application often has multiple undo stacks, one for each opened document. The active stack is the one associated with the currently active document. If the stack belongs to a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, calls to {@link com.trolltech.qt.gui.QUndoGroup#undo() QUndoGroup::undo()} or {@link com.trolltech.qt.gui.QUndoGroup#redo() QUndoGroup::redo()} will be forwarded to this stack when it is active. If the {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup} is watched by a {@link com.trolltech.qt.gui.QUndoView QUndoView}, the view will display the contents of this stack when it is active. If the stack does not belong to a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, making it active has no effect. <p>It is the programmer's responsibility to specify which stack is active by calling {@link com.trolltech.qt.gui.QUndoStack#setActive() setActive()}, usually when the associated document window receives focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="active")
    public final void setActive(boolean active)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActive_boolean(nativeId(), active);
    }
    native void __qt_setActive_boolean(long __this__nativeId, boolean active);

/**
Marks the stack as clean and emits {@link com.trolltech.qt.gui.QUndoStack#cleanChanged cleanChanged() } if the stack was not already clean. <p>Whenever the stack returns to this state through the use of undo/redo commands, it emits the signal {@link com.trolltech.qt.gui.QUndoStack#cleanChanged cleanChanged() }. This signal is also emitted when the stack leaves the clean state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#isClean() isClean()}, and {@link com.trolltech.qt.gui.QUndoStack#cleanIndex() cleanIndex()}. <br></DD></DT>
*/

    public final void setClean()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClean(nativeId());
    }
    native void __qt_setClean(long __this__nativeId);

/**
Repeatedly calls {@link com.trolltech.qt.gui.QUndoStack#undo() undo()} or {@link com.trolltech.qt.gui.QUndoStack#redo() redo()} until the the current command index reaches <tt>idx</tt>. This function can be used to roll the state of the document forwards of backwards. {@link com.trolltech.qt.gui.QUndoStack#indexChanged indexChanged() } is emitted only once. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#index() index()}, {@link com.trolltech.qt.gui.QUndoStack#count() count()}, {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}, and {@link com.trolltech.qt.gui.QUndoStack#redo() redo()}. <br></DD></DT>
*/

    public final void setIndex(int idx)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndex_int(nativeId(), idx);
    }
    native void __qt_setIndex_int(long __this__nativeId, int idx);

/**
This property holds the maximum number of commands on this stack.  When the number of commands on a stack exceedes the stack's {@link QUndoStack#undoLimit() undoLimit}, commands are deleted from the bottom of the stack. Macro commands (commands with child commands) are treated as one command. The default value is 0, which means that there is no limit. <p>This property may only be set when the undo stack is empty, since setting it on a non-empty stack might delete the command at the current index. Calling {@link com.trolltech.qt.gui.QUndoStack#setUndoLimit(int) setUndoLimit()} on a non-empty stack prints a warning and does nothing.
*/

    @com.trolltech.qt.QtPropertyWriter(name="undoLimit")
    @QtBlockedSlot
    public final void setUndoLimit(int limit)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUndoLimit_int(nativeId(), limit);
    }
    @QtBlockedSlot
    native void __qt_setUndoLimit_int(long __this__nativeId, int limit);

/**
Returns the text of the command at index <tt>idx</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#beginMacro(java.lang.String) beginMacro()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text(int idx)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text_int(nativeId(), idx);
    }
    @QtBlockedSlot
    native java.lang.String __qt_text_int(long __this__nativeId, int idx);

/**
Undoes the command below the current command by calling {@link com.trolltech.qt.gui.QUndoCommand#undo() QUndoCommand::undo()}. Decrements the current command index. <p>If the stack is empty, or if the bottom command on the stack has already been undone, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#redo() redo()}, and {@link com.trolltech.qt.gui.QUndoStack#index() index()}. <br></DD></DT>
*/

    public final void undo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    native void __qt_undo(long __this__nativeId);

/**
This property holds the maximum number of commands on this stack.  When the number of commands on a stack exceedes the stack's {@link QUndoStack#undoLimit() undoLimit}, commands are deleted from the bottom of the stack. Macro commands (commands with child commands) are treated as one command. The default value is 0, which means that there is no limit. <p>This property may only be set when the undo stack is empty, since setting it on a non-empty stack might delete the command at the current index. Calling {@link com.trolltech.qt.gui.QUndoStack#setUndoLimit(int) setUndoLimit()} on a non-empty stack prints a warning and does nothing.
*/

    @com.trolltech.qt.QtPropertyReader(name="undoLimit")
    @QtBlockedSlot
    public final int undoLimit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_undoLimit(nativeId());
    }
    @QtBlockedSlot
    native int __qt_undoLimit(long __this__nativeId);

/**
Returns the text of the command which will be undone in the next call to {@link com.trolltech.qt.gui.QUndoStack#undo() undo()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}, and {@link com.trolltech.qt.gui.QUndoStack#redoText() redoText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String undoText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_undoText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_undoText(long __this__nativeId);

/**
@exclude
*/

    public static native QUndoStack fromNativePointer(QNativePointer nativePointer);

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

    protected QUndoStack(QPrivateConstructor p) { super(p); } 
}
