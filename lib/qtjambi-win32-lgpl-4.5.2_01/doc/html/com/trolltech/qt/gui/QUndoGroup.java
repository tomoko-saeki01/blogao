package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QUndoGroup class is a group of {@link com.trolltech.qt.gui.QUndoStack QUndoStack} objects. For an overview of the Qt's undo framework, see the {@link <a href="../qundo.html">overview</a>}. <p>An application often has multiple undo stacks, one for each opened document. At the same time, an application usually has one undo action and one redo action, which triggers undo or redo in the active document. <p>QUndoGroup is a group of {@link com.trolltech.qt.gui.QUndoStack QUndoStack} objects, one of which may be active. It has an {@link com.trolltech.qt.gui.QUndoGroup#undo() undo()} and {@link com.trolltech.qt.gui.QUndoGroup#redo() redo()} slot, which calls {@link com.trolltech.qt.gui.QUndoStack#undo() QUndoStack::undo()} and {@link com.trolltech.qt.gui.QUndoStack#redo() QUndoStack::redo()} for the active stack. It also has the functions {@link com.trolltech.qt.gui.QUndoGroup#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()} and {@link com.trolltech.qt.gui.QUndoGroup#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}. The actions returned by these functions behave in the same way as those returned by {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) QUndoStack::createUndoAction()} and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) QUndoStack::createRedoAction()} of the active stack. <p>Stacks are added to a group with {@link com.trolltech.qt.gui.QUndoGroup#addStack(com.trolltech.qt.gui.QUndoStack) addStack()} and removed with {@link com.trolltech.qt.gui.QUndoGroup#removeStack(com.trolltech.qt.gui.QUndoStack) removeStack()}. A stack is implicitly added to a group when it is created with the group as its parent {@link com.trolltech.qt.core.QObject QObject}. <p>It is the programmer's responsibility to specify which stack is active by calling {@link QUndoStack#setActive() QUndoStack::setActive()}, usually when the associated document window receives focus. The active stack may also be set with {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}, and is returned by {@link com.trolltech.qt.gui.QUndoGroup#activeStack() activeStack()}. <p>When a stack is added to a group using {@link com.trolltech.qt.gui.QUndoGroup#addStack(com.trolltech.qt.gui.QUndoStack) addStack()}, the group does not take ownership of the stack. This means the stack has to be deleted separately from the group. When a stack is deleted, it is automatically removed from a group. A stack may belong to only one group. Adding it to another group will cause it to be removed from the previous group. <p>A QUndoGroup is also useful in conjunction with {@link com.trolltech.qt.gui.QUndoView QUndoView}. If a {@link com.trolltech.qt.gui.QUndoView QUndoView} is set to watch a group using {@link com.trolltech.qt.gui.QUndoView#setGroup(com.trolltech.qt.gui.QUndoGroup) QUndoView::setGroup()}, it will update itself to display the active stack.
*/
@QtJambiGeneratedClass
public class QUndoGroup extends com.trolltech.qt.core.QObject
{

    private java.util.Collection<Object> __rcStacks = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QUndoStack(named: stack)&gt;:<p> This signal is emitted whenever the active stack of the group changes. This can happen when {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()} or {@link QUndoStack#setActive() QUndoStack::setActive()} is called, or when the active stack is removed form the group. <tt>stack</tt> is the new active stack. If no stack is active, <tt>stack</tt> is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}, and {@link QUndoStack#setActive() QUndoStack::setActive()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QUndoStack> activeStackChanged = new Signal1<com.trolltech.qt.gui.QUndoStack>();

    private final void activeStackChanged(com.trolltech.qt.gui.QUndoStack stack)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activeStackChanged_QUndoStack(nativeId(), stack == null ? 0 : stack.nativeId());
    }
    native void __qt_activeStackChanged_QUndoStack(long __this__nativeId, long stack);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: canRedo)&gt;:<p> This signal is emitted whenever the active stack emits {@link com.trolltech.qt.gui.QUndoStack#canRedoChanged QUndoStack::canRedoChanged() } or the active stack changes. <p><tt>canRedo</tt> is the new state, or false if the active stack is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#canRedoChanged QUndoStack::canRedoChanged() }, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: canUndo)&gt;:<p> This signal is emitted whenever the active stack emits {@link com.trolltech.qt.gui.QUndoStack#canUndoChanged QUndoStack::canUndoChanged() } or the active stack changes. <p><tt>canUndo</tt> is the new state, or false if the active stack is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#canUndoChanged QUndoStack::canUndoChanged() }, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: clean)&gt;:<p> This signal is emitted whenever the active stack emits {@link com.trolltech.qt.gui.QUndoStack#cleanChanged QUndoStack::cleanChanged() } or the active stack changes. <p><tt>clean</tt> is the new state, or true if the active stack is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#cleanChanged QUndoStack::cleanChanged() }, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: idx)&gt;:<p> This signal is emitted whenever the active stack emits {@link com.trolltech.qt.gui.QUndoStack#indexChanged QUndoStack::indexChanged() } or the active stack changes. <p><tt>idx</tt> is the new current index, or 0 if the active stack is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#indexChanged QUndoStack::indexChanged() }, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: redoText)&gt;:<p> This signal is emitted whenever the active stack emits {@link com.trolltech.qt.gui.QUndoStack#redoTextChanged QUndoStack::redoTextChanged() } or the active stack changes. <p><tt>redoText</tt> is the new state, or an empty string if the active stack is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#redoTextChanged QUndoStack::redoTextChanged() }, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: undoText)&gt;:<p> This signal is emitted whenever the active stack emits {@link com.trolltech.qt.gui.QUndoStack#undoTextChanged QUndoStack::undoTextChanged() } or the active stack changes. <p><tt>undoText</tt> is the new state, or an empty string if the active stack is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoStack#undoTextChanged QUndoStack::undoTextChanged() }, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
Creates an empty QUndoGroup object with parent <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#addStack(com.trolltech.qt.gui.QUndoStack) addStack()}. <br></DD></DT>
*/

    public QUndoGroup() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates an empty QUndoGroup object with parent <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#addStack(com.trolltech.qt.gui.QUndoStack) addStack()}. <br></DD></DT>
*/

    public QUndoGroup(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QUndoGroup_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoGroup_QObject(long parent);

/**
Returns the active stack of this group. <p>If none of the stacks are active, or if the group is empty, this function returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}, and {@link QUndoStack#setActive() QUndoStack::setActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QUndoStack activeStack()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeStack(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QUndoStack __qt_activeStack(long __this__nativeId);

/**
Adds <tt>stack</tt> to this group. The group does not take ownership of the stack. Another way of adding a stack to a group is by specifying the group as the stack's parent {@link com.trolltech.qt.core.QObject QObject} in QUndoStack::QUndoStack(). In this case, the stack is deleted when the group is deleted, in the usual manner of QObjects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#removeStack(com.trolltech.qt.gui.QUndoStack) removeStack()}, {@link com.trolltech.qt.gui.QUndoGroup#stacks() stacks()}, and QUndoStack::QUndoStack(). <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addStack(com.trolltech.qt.gui.QUndoStack stack)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (stack != null) {
            __rcStacks.add(stack);
        }
        __qt_addStack_QUndoStack(nativeId(), stack == null ? 0 : stack.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addStack_QUndoStack(long __this__nativeId, long stack);

/**
Returns the value of the active stack's {@link com.trolltech.qt.gui.QUndoStack#canRedo() QUndoStack::canRedo()}. <p>If none of the stacks are active, or if the group is empty, this function returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#canUndo() canUndo()}, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
Returns the value of the active stack's {@link com.trolltech.qt.gui.QUndoStack#canUndo() QUndoStack::canUndo()}. <p>If none of the stacks are active, or if the group is empty, this function returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#canRedo() canRedo()}, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
Creates an redo {@link com.trolltech.qt.gui.QAction QAction} object with parent <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#redo() QUndoStack::redo()} on the active stack. The text of this action will always be the text of the command which will be redone in the next call to {@link com.trolltech.qt.gui.QUndoGroup#redo() redo()}, prefixed by <tt>prefix</tt>. If there is no command available for redo, if the group is empty or if none of the stacks are active, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Undo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()}, {@link com.trolltech.qt.gui.QUndoGroup#canRedo() canRedo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction createRedoAction(com.trolltech.qt.core.QObject parent) {
        return createRedoAction(parent, (java.lang.String)null);
    }
/**
Creates an redo {@link com.trolltech.qt.gui.QAction QAction} object with parent <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#redo() QUndoStack::redo()} on the active stack. The text of this action will always be the text of the command which will be redone in the next call to {@link com.trolltech.qt.gui.QUndoGroup#redo() redo()}, prefixed by <tt>prefix</tt>. If there is no command available for redo, if the group is empty or if none of the stacks are active, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Undo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()}, {@link com.trolltech.qt.gui.QUndoGroup#canRedo() canRedo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
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
Creates an undo {@link com.trolltech.qt.gui.QAction QAction} object with parent <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#undo() QUndoStack::undo()} on the active stack. The text of this action will always be the text of the command which will be undone in the next call to {@link com.trolltech.qt.gui.QUndoGroup#undo() undo()}, prefixed by <tt>prefix</tt>. If there is no command available for undo, if the group is empty or if none of the stacks are active, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Undo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}, {@link com.trolltech.qt.gui.QUndoGroup#canUndo() canUndo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction createUndoAction(com.trolltech.qt.core.QObject parent) {
        return createUndoAction(parent, (java.lang.String)null);
    }
/**
Creates an undo {@link com.trolltech.qt.gui.QAction QAction} object with parent <tt>parent</tt>. <p>Triggering this action will cause a call to {@link com.trolltech.qt.gui.QUndoStack#undo() QUndoStack::undo()} on the active stack. The text of this action will always be the text of the command which will be undone in the next call to {@link com.trolltech.qt.gui.QUndoGroup#undo() undo()}, prefixed by <tt>prefix</tt>. If there is no command available for undo, if the group is empty or if none of the stacks are active, this action will be disabled. <p>If <tt>prefix</tt> is empty, the default prefix "Undo" is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()}, {@link com.trolltech.qt.gui.QUndoGroup#canUndo() canUndo()}, and {@link com.trolltech.qt.gui.QUndoCommand#text() QUndoCommand::text()}. <br></DD></DT>
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
Returns the value of the active stack's {@link com.trolltech.qt.gui.QUndoStack#isClean() QUndoStack::isClean()}. <p>If none of the stacks are active, or if the group is empty, this function returns true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
Calls {@link com.trolltech.qt.gui.QUndoStack#redo() QUndoStack::redo()} on the active stack. <p>If none of the stacks are active, or if the group is empty, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#undo() undo()}, {@link com.trolltech.qt.gui.QUndoGroup#canRedo() canRedo()}, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
*/

    public final void redo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    native void __qt_redo(long __this__nativeId);

/**
Returns the value of the active stack's {@link com.trolltech.qt.gui.QUndoStack#redoText() QUndoStack::redoText()}. <p>If none of the stacks are active, or if the group is empty, this function returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#undoText() undoText()}, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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
Removes <tt>stack</tt> from this group. If the stack was the active stack in the group, the active stack becomes 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#addStack(com.trolltech.qt.gui.QUndoStack) addStack()}, {@link com.trolltech.qt.gui.QUndoGroup#stacks() stacks()}, and QUndoStack::~QUndoStack(). <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeStack(com.trolltech.qt.gui.QUndoStack stack)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (stack != null) {
            while (__rcStacks.remove(stack)) ;
        }
        __qt_removeStack_QUndoStack(nativeId(), stack == null ? 0 : stack.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeStack_QUndoStack(long __this__nativeId, long stack);

/**
Sets the active stack of this group to <tt>stack</tt>. <p>If the stack is not a member of this group, this function does nothing. <p>Synonymous with calling {@link QUndoStack#setActive() QUndoStack::setActive()} on <tt>stack</tt>. <p>The actions returned by {@link com.trolltech.qt.gui.QUndoGroup#createUndoAction(com.trolltech.qt.core.QObject) createUndoAction()} and {@link com.trolltech.qt.gui.QUndoGroup#createRedoAction(com.trolltech.qt.core.QObject) createRedoAction()} will now behave in the same way as those returned by <tt>stack</tt>'s {@link com.trolltech.qt.gui.QUndoStack#createUndoAction(com.trolltech.qt.core.QObject) QUndoStack::createUndoAction()} and {@link com.trolltech.qt.gui.QUndoStack#createRedoAction(com.trolltech.qt.core.QObject) QUndoStack::createRedoAction()}. <p><DT><b>See also:</b><br><DD>{@link QUndoStack#setActive() QUndoStack::setActive()}, and {@link com.trolltech.qt.gui.QUndoGroup#activeStack() activeStack()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public final void setActiveStack(com.trolltech.qt.gui.QUndoStack stack)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveStack_QUndoStack(nativeId(), stack == null ? 0 : stack.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setActiveStack_QUndoStack(long __this__nativeId, long stack);

/**
Returns a list of stacks in this group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#addStack(com.trolltech.qt.gui.QUndoStack) addStack()}, and {@link com.trolltech.qt.gui.QUndoGroup#removeStack(com.trolltech.qt.gui.QUndoStack) removeStack()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QUndoStack> stacks()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stacks(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QUndoStack> __qt_stacks(long __this__nativeId);

/**
Calls {@link com.trolltech.qt.gui.QUndoStack#undo() QUndoStack::undo()} on the active stack. <p>If none of the stacks are active, or if the group is empty, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#redo() redo()}, {@link com.trolltech.qt.gui.QUndoGroup#canUndo() canUndo()}, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
*/

    public final void undo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    native void __qt_undo(long __this__nativeId);

/**
Returns the value of the active stack's {@link com.trolltech.qt.gui.QUndoStack#undoText() QUndoStack::undoText()}. <p>If none of the stacks are active, or if the group is empty, this function returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoGroup#redoText() redoText()}, and {@link com.trolltech.qt.gui.QUndoGroup#setActiveStack(com.trolltech.qt.gui.QUndoStack) setActiveStack()}. <br></DD></DT>
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

    public static native QUndoGroup fromNativePointer(QNativePointer nativePointer);

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

    protected QUndoGroup(QPrivateConstructor p) { super(p); } 
}
