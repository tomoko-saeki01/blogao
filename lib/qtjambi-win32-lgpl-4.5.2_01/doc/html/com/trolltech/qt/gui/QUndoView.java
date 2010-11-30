package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QUndoView class displays the contents of a {@link com.trolltech.qt.gui.QUndoStack QUndoStack}. QUndoView is a {@link com.trolltech.qt.gui.QListView QListView} which displays the list of commands pushed on an undo stack. The most recently executed command is always selected. Selecting a different command results in a call to {@link com.trolltech.qt.gui.QUndoStack#setIndex(int) QUndoStack::setIndex()}, rolling the state of the document backwards or forward to the new command. <p>The stack can be set explicitly with {@link com.trolltech.qt.gui.QUndoView#setStack(com.trolltech.qt.gui.QUndoStack) setStack()}. Alternatively, a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup} object can be set with {@link com.trolltech.qt.gui.QUndoView#setGroup(com.trolltech.qt.gui.QUndoGroup) setGroup()}. The view will then update itself automatically whenever the active stack of the group changes. <br><center><img src="../images/qundoview.png"></center><br>
*/
@QtJambiGeneratedClass
public class QUndoView extends com.trolltech.qt.gui.QListView
{

    private Object __rcGroupOrStack = null;


/**
Constructs a new view with parent <tt>parent</tt> and sets the observed group to <tt>group</tt>. <p>The view will update itself autmiatically whenever the active stack of the group changes.
*/

    public QUndoView(com.trolltech.qt.gui.QUndoGroup group) {
        this(group, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new view with parent <tt>parent</tt> and sets the observed group to <tt>group</tt>. <p>The view will update itself autmiatically whenever the active stack of the group changes.
*/

    public QUndoView(com.trolltech.qt.gui.QUndoGroup group, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        {
            __rcGroupOrStack = group;
        }
        __qt_QUndoView_QUndoGroup_QWidget(group == null ? 0 : group.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoView_QUndoGroup_QWidget(long group, long parent);


/**
Constructs a new view with parent <tt>parent</tt> and sets the observed stack to <tt>stack</tt>.
*/

    public QUndoView(com.trolltech.qt.gui.QUndoStack stack) {
        this(stack, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new view with parent <tt>parent</tt> and sets the observed stack to <tt>stack</tt>.
*/

    public QUndoView(com.trolltech.qt.gui.QUndoStack stack, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        {
            __rcGroupOrStack = stack;
        }
        __qt_QUndoView_QUndoStack_QWidget(stack == null ? 0 : stack.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoView_QUndoStack_QWidget(long stack, long parent);


/**
Constructs a new view with parent <tt>parent</tt>.
*/

    public QUndoView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new view with parent <tt>parent</tt>.
*/

    public QUndoView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QUndoView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QUndoView_QWidget(long parent);

/**
This property holds the icon used to represent the clean state.  A stack may have a clean state set with {@link com.trolltech.qt.gui.QUndoStack#setClean() QUndoStack::setClean()}. This is usually the state of the document at the point it was saved. QUndoView can display an icon in the list of commands to show the clean state. If this property is a null icon, no icon is shown. The default value is the null icon.
*/

    @com.trolltech.qt.QtPropertyReader(name="cleanIcon")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon cleanIcon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cleanIcon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_cleanIcon(long __this__nativeId);

/**
This property holds the label used for the empty state.  The empty label is the topmost element in the list of commands, which represents the state of the document before any commands were pushed on the stack. The default is the string "&lt;empty&gt;".
*/

    @com.trolltech.qt.QtPropertyReader(name="emptyLabel")
    @QtBlockedSlot
    public final java.lang.String emptyLabel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_emptyLabel(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_emptyLabel(long __this__nativeId);

/**
Returns the group displayed by this view. <p>If the view is not looking at group, this function returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoView#setGroup(com.trolltech.qt.gui.QUndoGroup) setGroup()}, and {@link com.trolltech.qt.gui.QUndoView#setStack(com.trolltech.qt.gui.QUndoStack) setStack()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QUndoGroup group()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_group(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QUndoGroup __qt_group(long __this__nativeId);

/**
This property holds the icon used to represent the clean state.  A stack may have a clean state set with {@link com.trolltech.qt.gui.QUndoStack#setClean() QUndoStack::setClean()}. This is usually the state of the document at the point it was saved. QUndoView can display an icon in the list of commands to show the clean state. If this property is a null icon, no icon is shown. The default value is the null icon.
*/

    @com.trolltech.qt.QtPropertyWriter(name="cleanIcon")
    @QtBlockedSlot
    public final void setCleanIcon(com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCleanIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCleanIcon_QIcon(long __this__nativeId, long icon);

/**
This property holds the label used for the empty state.  The empty label is the topmost element in the list of commands, which represents the state of the document before any commands were pushed on the stack. The default is the string "&lt;empty&gt;".
*/

    @com.trolltech.qt.QtPropertyWriter(name="emptyLabel")
    @QtBlockedSlot
    public final void setEmptyLabel(java.lang.String label)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEmptyLabel_String(nativeId(), label);
    }
    @QtBlockedSlot
    native void __qt_setEmptyLabel_String(long __this__nativeId, java.lang.String label);

/**
Sets the group displayed by this view to <tt>group</tt>. If <tt>group</tt> is 0, the view will be empty. <p>The view will update itself autmiatically whenever the active stack of the group changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoView#group() group()}, and {@link com.trolltech.qt.gui.QUndoView#setStack(com.trolltech.qt.gui.QUndoStack) setStack()}. <br></DD></DT>
*/

    public final void setGroup(com.trolltech.qt.gui.QUndoGroup group)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcGroupOrStack = group;
        }
        __qt_setGroup_QUndoGroup(nativeId(), group == null ? 0 : group.nativeId());
    }
    native void __qt_setGroup_QUndoGroup(long __this__nativeId, long group);

/**
Sets the stack displayed by this view to <tt>stack</tt>. If <tt>stack</tt> is 0, the view will be empty. <p>If the view was previously looking at a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, the group is set to 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoView#stack() stack()}, and {@link com.trolltech.qt.gui.QUndoView#setGroup(com.trolltech.qt.gui.QUndoGroup) setGroup()}. <br></DD></DT>
*/

    public final void setStack(com.trolltech.qt.gui.QUndoStack stack)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcGroupOrStack = stack;
        }
        __qt_setStack_QUndoStack(nativeId(), stack == null ? 0 : stack.nativeId());
    }
    native void __qt_setStack_QUndoStack(long __this__nativeId, long stack);

/**
Returns the stack currently displayed by this view. If the view is looking at a {@link com.trolltech.qt.gui.QUndoGroup QUndoGroup}, this the group's active stack. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QUndoView#setStack(com.trolltech.qt.gui.QUndoStack) setStack()}, and {@link com.trolltech.qt.gui.QUndoView#setGroup(com.trolltech.qt.gui.QUndoGroup) setGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QUndoStack stack()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stack(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QUndoStack __qt_stack(long __this__nativeId);

/**
@exclude
*/

    public static native QUndoView fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QUndoView(QPrivateConstructor p) { super(p); } 
}
