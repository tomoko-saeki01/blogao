package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneDragDropEvent class provides events for drag and drop in the graphics view framework. {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} inherits the drag and drop functionality provided by {@link com.trolltech.qt.gui.QWidget QWidget}. When it receives a drag and drop event, it translates it to a QGraphicsSceneDragDropEvent. <p>QGraphicsSceneDragDropEvent stores events of type {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneDragEnter }, {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneDragLeave }, {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneDragMove }, or {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneDrop }. <p>QGraphicsSceneDragDropEvent contains the position of the mouse cursor in both item, scene, and screen coordinates; this can be retrieved with {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#screenPos() screenPos()}. <p>The scene sends the event to the first {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} under the mouse cursor that accepts drops; a graphics item is set to accept drops with {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptDrops(boolean) setAcceptDrops()}.
*/
@QtJambiGeneratedClass
public class QGraphicsSceneDragDropEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneDragDropEvent() {
        this(com.trolltech.qt.core.QEvent.Type.None);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneDragDropEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneDragDropEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneDragDropEvent_Type(int type);

/**
Sets the proposed action as accepted, i. , the drop action is set to the proposed action. This is equal to: <pre class="snippet">
    setDropAction(proposedAction());
</pre> When using this function, one should not call <tt>accept()</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#dropAction() dropAction()}, {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#setDropAction(com.trolltech.qt.core.Qt.DropAction) setDropAction()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#proposedAction() proposedAction()}. <br></DD></DT>
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
Returns a Qt.:MouseButtons value indicating which buttons were pressed on the mouse when this mouse event was generated. <p><DT><b>See also:</b><br><DD>Qt::MouseButtons. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.MouseButtons buttons()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_buttons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_buttons(long __this__nativeId);

/**
Returns the action that was performed in this drag and drop. This should be set by the receiver of the drop and is returned by QDrag::start(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#setDropAction(com.trolltech.qt.core.Qt.DropAction) setDropAction()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#acceptProposedAction() acceptProposedAction()}. <br></DD></DT>
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
This function returns the MIME data of the event.
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
Returns the keyboard modifiers that were pressed when the drag and drop event was created. <p><DT><b>See also:</b><br><DD>Qt::KeyboardModifiers. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.KeyboardModifiers modifiers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_modifiers(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modifiers(long __this__nativeId);

/**
Returns the mouse position of the event relative to the view that sent the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}, {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#screenPos() screenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#scenePos() scenePos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_pos(long __this__nativeId);

/**
Returns the possible drop actions that the drag and drop can result in. <p><DT><b>See also:</b><br><DD>Qt::DropActions. <br></DD></DT>
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
Returns the drop action that is proposed, i. ., preferred. The action must be one of the possible actions as defined by <tt>possibleActions()</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.DropAction Qt::DropAction }, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#possibleActions() possibleActions()}. <br></DD></DT>
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
Returns the position of the mouse in scene coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#screenPos() screenPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF scenePos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scenePos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_scenePos(long __this__nativeId);

/**
Returns the position of the mouse relative to the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#scenePos() scenePos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint screenPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_screenPos(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setButtons(com.trolltech.qt.core.Qt.MouseButton ... buttons) {
        this.setButtons(new com.trolltech.qt.core.Qt.MouseButtons(buttons));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setButtons(com.trolltech.qt.core.Qt.MouseButtons buttons)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtons_MouseButtons(nativeId(), buttons.value());
    }
    @QtBlockedSlot
    native void __qt_setButtons_MouseButtons(long __this__nativeId, int buttons);

/**
This function lets the receiver of the drop set the drop action that was performed to <tt>action</tt>, which should be one of the {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#possibleActions() possible actions}. Call <tt>accept()</tt> in stead of <tt>acceptProposedAction()</tt> if you use this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#dropAction() dropAction()}, {@link com.trolltech.qt.core.QEvent#accept() accept()}, and {@link com.trolltech.qt.gui.QGraphicsSceneDragDropEvent#possibleActions() possibleActions()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setModifiers(com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this.setModifiers(new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setModifiers(com.trolltech.qt.core.Qt.KeyboardModifiers modifiers)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModifiers_KeyboardModifiers(nativeId(), modifiers.value());
    }
    @QtBlockedSlot
    native void __qt_setModifiers_KeyboardModifiers(long __this__nativeId, int modifiers);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setPos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPos_QPointF(long __this__nativeId, long pos);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setPossibleActions(com.trolltech.qt.core.Qt.DropAction ... actions) {
        this.setPossibleActions(new com.trolltech.qt.core.Qt.DropActions(actions));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setPossibleActions(com.trolltech.qt.core.Qt.DropActions actions)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPossibleActions_DropActions(nativeId(), actions.value());
    }
    @QtBlockedSlot
    native void __qt_setPossibleActions_DropActions(long __this__nativeId, int actions);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setProposedAction(com.trolltech.qt.core.Qt.DropAction action)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProposedAction_DropAction(nativeId(), action.value());
    }
    @QtBlockedSlot
    native void __qt_setProposedAction_DropAction(long __this__nativeId, int action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setScenePos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScenePos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScenePos_QPointF(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setScreenPos(com.trolltech.qt.core.QPoint pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScreenPos_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScreenPos_QPoint(long __this__nativeId, long pos);

/**
This function returns the {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} that created the QGraphicsSceneDragDropEvent.
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
@exclude
*/

    public static native QGraphicsSceneDragDropEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneDragDropEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneDragDropEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
