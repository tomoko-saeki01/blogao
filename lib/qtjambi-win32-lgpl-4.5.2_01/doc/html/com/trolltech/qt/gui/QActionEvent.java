package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QActionEvent class provides an event that is generated when a {@link com.trolltech.qt.gui.QAction QAction} is added, removed, or changed. Actions can be added to widgets using {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. This generates an {@link com.trolltech.qt.core.QEvent.Type ActionAdded } event, which you can handle to provide custom behavior. For example, {@link com.trolltech.qt.gui.QToolBar QToolBar} reimplements {@link com.trolltech.qt.gui.QWidget#actionEvent(com.trolltech.qt.gui.QActionEvent) QWidget::actionEvent()} to create {@link com.trolltech.qt.gui.QToolButton QToolButton}s for the actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction QAction}, {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) QWidget::removeAction()}, and {@link com.trolltech.qt.gui.QWidget#actions() QWidget::actions()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QActionEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs an action event. The <tt>type</tt> can be {@link com.trolltech.qt.core.QEvent.Type ActionChanged }, {@link com.trolltech.qt.core.QEvent.Type ActionAdded }, or {@link com.trolltech.qt.core.QEvent.Type ActionRemoved }. <p><tt>action</tt> is the action that is changed, added, or removed. If <tt>type</tt> is {@link com.trolltech.qt.core.QEvent.Type ActionAdded }, the action is to be inserted before the action <tt>before</tt>. If <tt>before</tt> is 0, the action is appended.
*/

    public QActionEvent(int type, com.trolltech.qt.gui.QAction action) {
        this(type, action, (com.trolltech.qt.gui.QAction)null);
    }
/**
Constructs an action event. The <tt>type</tt> can be {@link com.trolltech.qt.core.QEvent.Type ActionChanged }, {@link com.trolltech.qt.core.QEvent.Type ActionAdded }, or {@link com.trolltech.qt.core.QEvent.Type ActionRemoved }. <p><tt>action</tt> is the action that is changed, added, or removed. If <tt>type</tt> is {@link com.trolltech.qt.core.QEvent.Type ActionAdded }, the action is to be inserted before the action <tt>before</tt>. If <tt>before</tt> is 0, the action is appended.
*/

    public QActionEvent(int type, com.trolltech.qt.gui.QAction action, com.trolltech.qt.gui.QAction before){
        super((QPrivateConstructor)null);
        __qt_QActionEvent_int_QAction_QAction(type, action == null ? 0 : action.nativeId(), before == null ? 0 : before.nativeId());
    }

    native void __qt_QActionEvent_int_QAction_QAction(int type, long action, long before);

/**
Returns the action that is changed, added, or removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QActionEvent#before() before()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction action()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_action(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_action(long __this__nativeId);

/**
If {@link com.trolltech.qt.core.QEvent#type() type()} is {@link com.trolltech.qt.core.QEvent.Type ActionAdded }, returns the action that should appear before {@link com.trolltech.qt.gui.QActionEvent#action() action()}. If this function returns 0, the action should be appended to already existing actions on the same widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QActionEvent#action() action()}, and {@link com.trolltech.qt.gui.QWidget#actions() QWidget::actions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction before()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_before(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_before(long __this__nativeId);

/**
@exclude
*/

    public static native QActionEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QActionEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QActionEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
