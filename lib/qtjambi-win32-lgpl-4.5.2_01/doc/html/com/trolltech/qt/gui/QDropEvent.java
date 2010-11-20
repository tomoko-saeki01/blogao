package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDropEvent class provides an event which is sent when a drag and drop action is completed. When a widget {@link QWidget#setAcceptDrops(boolean) accepts drop events}, it will receive this event if it has accepted the most recent {@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent} or {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent} sent to it. <p>The drop event contains a proposed action, available from {@link com.trolltech.qt.gui.QDropEvent#proposedAction() proposedAction()}, for the widget to either accept or ignore. If the action can be handled by the widget, you should call the {@link com.trolltech.qt.gui.QDropEvent#acceptProposedAction() acceptProposedAction()} function. Since the proposed action can be a combination of {@link com.trolltech.qt.core.Qt.DropAction Qt::DropAction } values, it may be useful to either select one of these values as a default action or ask the user to select their preferred action. <p>If the proposed drop action is not suitable, perhaps because your custom widget does not support that action, you can replace it with any of the {@link com.trolltech.qt.gui.QDropEvent#possibleActions() possible drop actions} by calling {@link com.trolltech.qt.gui.QDropEvent#setDropAction(com.trolltech.qt.core.Qt.DropAction) setDropAction()} with your preferred action. If you set a value that is not present in the bitwise OR combination of values returned by {@link com.trolltech.qt.gui.QDropEvent#possibleActions() possibleActions()}, the default copy action will be used. Once a replacement drop action has been set, call accept() instead of {@link com.trolltech.qt.gui.QDropEvent#acceptProposedAction() acceptProposedAction()} to complete the drop operation. <p>The {@link com.trolltech.qt.gui.QDropEvent#mimeData() mimeData()} function provides the data dropped on the widget in a {@link com.trolltech.qt.core.QMimeData QMimeData} object. This contains information about the MIME type of the data in addition to the data itself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData QMimeData}, {@link com.trolltech.qt.gui.QDrag QDrag}, and {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDropEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a drop event of a certain <tt>type</tt> corresponding to a drop at the point specified by <tt>pos</tt> in the destination widget's coordinate system. <p>The <tt>actions</tt> indicate which types of drag and drop operation can be performed, and the drag data is stored as MIME-encoded data in <tt>data</tt>. <p>The states of the mouse buttons and keyboard modifiers at the time of the drop are specified by <tt>buttons</tt> and <tt>modifiers</tt>.
*/

    public QDropEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.DropActions actions, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers) {
        this(pos, actions, data, buttons, modifiers, com.trolltech.qt.core.QEvent.Type.Drop);
    }
/**
Constructs a drop event of a certain <tt>type</tt> corresponding to a drop at the point specified by <tt>pos</tt> in the destination widget's coordinate system. <p>The <tt>actions</tt> indicate which types of drag and drop operation can be performed, and the drag data is stored as MIME-encoded data in <tt>data</tt>. <p>The states of the mouse buttons and keyboard modifiers at the time of the drop are specified by <tt>buttons</tt> and <tt>modifiers</tt>.
*/

    public QDropEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.DropActions actions, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QDropEvent_QPoint_DropActions_QMimeData_MouseButtons_KeyboardModifiers_Type(pos == null ? 0 : pos.nativeId(), actions.value(), data == null ? 0 : data.nativeId(), buttons.value(), modifiers.value(), type.value());
    }

    native void __qt_QDropEvent_QPoint_DropActions_QMimeData_MouseButtons_KeyboardModifiers_Type(long pos, int actions, long data, int buttons, int modifiers, int type);

/**
Sets the drop action to be the proposed action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDropEvent#setDropAction(com.trolltech.qt.core.Qt.DropAction) setDropAction()}, {@link com.trolltech.qt.gui.QDropEvent#proposedAction() proposedAction()}, and {@link com.trolltech.qt.core.QEvent#accept() accept()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void acceptProposedAction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_acceptProposedAction(nativeId());
    }
    @QtBlockedSlot
    native void __qt_acceptProposedAction(long __this__nativeId);

/**
Returns the action to be performed on the data by the target. This may be different from the action supplied in {@link com.trolltech.qt.gui.QDropEvent#proposedAction() proposedAction()} if you have called {@link com.trolltech.qt.gui.QDropEvent#setDropAction(com.trolltech.qt.core.Qt.DropAction) setDropAction()} to explicitly choose a drop action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDropEvent#setDropAction(com.trolltech.qt.core.Qt.DropAction) setDropAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropAction dropAction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DropAction.resolve(__qt_dropAction(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dropAction(long __this__nativeId);

/**
Returns the modifier keys that are pressed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.KeyboardModifiers keyboardModifiers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_keyboardModifiers(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_keyboardModifiers(long __this__nativeId);

/**
Returns the data that was dropped on the widget and its associated MIME type information.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QMimeData mimeData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData(long __this__nativeId);

/**
Returns the mouse buttons that are pressed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.MouseButtons mouseButtons()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_mouseButtons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_mouseButtons(long __this__nativeId);

/**
Returns the position where the drop was made.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
Returns an OR-combination of possible drop actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDropEvent#dropAction() dropAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropActions possibleActions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.DropActions(__qt_possibleActions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_possibleActions(long __this__nativeId);

/**
Returns the proposed drop action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDropEvent#dropAction() dropAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropAction proposedAction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DropAction.resolve(__qt_proposedAction(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_proposedAction(long __this__nativeId);

/**
Sets the <tt>action</tt> to be performed on the data by the target. Use this to override the {@link com.trolltech.qt.gui.QDropEvent#proposedAction() proposed action} with one of the {@link com.trolltech.qt.gui.QDropEvent#possibleActions() possible actions}. <p>If you set a drop action that is not one of the possible actions, the drag and drop operation will default to a copy operation. <p>Once you have supplied a replacement drop action, call accept() instead of {@link com.trolltech.qt.gui.QDropEvent#acceptProposedAction() acceptProposedAction()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDropEvent#dropAction() dropAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDropAction(com.trolltech.qt.core.Qt.DropAction action)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDropAction_DropAction(nativeId(), action.value());
    }
    @QtBlockedSlot
    native void __qt_setDropAction_DropAction(long __this__nativeId, int action);

/**
If the source of the drag operation is a widget in this application, this function returns that source; otherwise it returns 0. The source of the operation is the first parameter to the {@link com.trolltech.qt.gui.QDrag QDrag} object used instantiate the drag. <p>This is useful if your widget needs special behavior when dragging to itself. <p><DT><b>See also:</b><br><DD>QDrag::QDrag(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget source()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_source(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_source(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QMimeData mdata()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mdata(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mdata(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setDefault_action(com.trolltech.qt.core.Qt.DropAction default_action)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefault_action_DropAction(nativeId(), default_action.value());
    }
    @QtBlockedSlot
    native void __qt_setDefault_action_DropAction(long __this__nativeId, int default_action);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.DropAction default_action()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DropAction.resolve(__qt_default_action(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_default_action(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setModState(com.trolltech.qt.core.Qt.KeyboardModifier ... modState) {
        this.setModState(new com.trolltech.qt.core.Qt.KeyboardModifiers(modState));
    }
/**

*/

    @QtBlockedSlot
    protected final void setModState(com.trolltech.qt.core.Qt.KeyboardModifiers modState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModState_KeyboardModifiers(nativeId(), modState.value());
    }
    @QtBlockedSlot
    native void __qt_setModState_KeyboardModifiers(long __this__nativeId, int modState);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.KeyboardModifiers modState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_modState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modState(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setFmts(java.util.List<com.trolltech.qt.core.QByteArray> fmts)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFmts_List(nativeId(), fmts);
    }
    @QtBlockedSlot
    native void __qt_setFmts_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QByteArray> fmts);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.core.QByteArray> fmts()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fmts(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_fmts(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setMouseState(com.trolltech.qt.core.Qt.MouseButton ... mouseState) {
        this.setMouseState(new com.trolltech.qt.core.Qt.MouseButtons(mouseState));
    }
/**

*/

    @QtBlockedSlot
    protected final void setMouseState(com.trolltech.qt.core.Qt.MouseButtons mouseState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMouseState_MouseButtons(nativeId(), mouseState.value());
    }
    @QtBlockedSlot
    native void __qt_setMouseState_MouseButtons(long __this__nativeId, int mouseState);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.MouseButtons mouseState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_mouseState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_mouseState(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setDrop_action(com.trolltech.qt.core.Qt.DropAction drop_action)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDrop_action_DropAction(nativeId(), drop_action.value());
    }
    @QtBlockedSlot
    native void __qt_setDrop_action_DropAction(long __this__nativeId, int drop_action);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.DropAction drop_action()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DropAction.resolve(__qt_drop_action(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_drop_action(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setP(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setP_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setP_QPoint(long __this__nativeId, long p);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint p()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_p(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_p(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setAct(com.trolltech.qt.core.Qt.DropAction ... act) {
        this.setAct(new com.trolltech.qt.core.Qt.DropActions(act));
    }
/**

*/

    @QtBlockedSlot
    protected final void setAct(com.trolltech.qt.core.Qt.DropActions act)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAct_DropActions(nativeId(), act.value());
    }
    @QtBlockedSlot
    native void __qt_setAct_DropActions(long __this__nativeId, int act);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.DropActions act()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.DropActions(__qt_act(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_act(long __this__nativeId);

/**
@exclude
*/

    public static native QDropEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDropEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QDropEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
