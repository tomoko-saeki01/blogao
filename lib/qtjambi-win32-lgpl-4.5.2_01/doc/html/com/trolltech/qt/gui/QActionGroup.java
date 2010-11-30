package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QActionGroup class groups actions together. In some situations it is useful to group actions together. For example, if you have a <b>Left Align</b> action, a <b>Right Align</b> action, a <b>Justify</b> action, and a <b>Center</b> action, only one of these actions should be active at any one time. One simple way of achieving this is to group the actions together in an action group. <p>Here's a example (from the {@link <a href="../qtjambi-menus.html">Menus</a>} example):<br><br>The following code example is written in c++.<br> <pre class="snippet"> 
    alignmentGroup = new QActionGroup(this);
    alignmentGroup-&gt;addAction(leftAlignAct);
    alignmentGroup-&gt;addAction(rightAlignAct);
    alignmentGroup-&gt;addAction(justifyAct);
    alignmentGroup-&gt;addAction(centerAct);
    leftAlignAct-&gt;setChecked(true);
</pre> Here we create a new action group. Since the action group is exclusive by default, only one of the actions in the group is checked at any one time. <br><center><img src="../images/qactiongroup-align.png"></center><br> A QActionGroup emits an {@link com.trolltech.qt.gui.QActionGroup#triggered triggered() } signal when one of its actions is chosen. Each action in an action group emits its {@link com.trolltech.qt.gui.QActionGroup#triggered triggered() } signal as usual. <p>As stated above, an action group is {@link QActionGroup#isExclusive() exclusive} by default; it ensures that only one checkable action is active at any one time. If you want to group checkable actions without making them exclusive, you can turn of exclusiveness by calling setExclusive(false). <p>Actions can be added to an action group using {@link com.trolltech.qt.gui.QActionGroup#addAction(com.trolltech.qt.gui.QAction) addAction()}, but it is usually more convenient to specify a group when creating actions; this ensures that actions are automatically created with a parent. Actions can be visually separated from each other by adding a separator action to the group; create an action and use {@link com.trolltech.qt.gui.QAction QAction}'s {@link com.trolltech.qt.gui.QAction#setSeparator(boolean) setSeparator()} function to make it considered a separator. Action groups are added to widgets with the {@link com.trolltech.qt.gui.QWidget#addActions(java.util.List) QWidget::addActions()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction QAction}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QActionGroup extends com.trolltech.qt.core.QObject
{

    private java.util.Collection<Object> __rcActions = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when the given <tt>action</tt> in the action group is highlighted by the user; for example, when the user pauses with the cursor over a menu option, toolbar button, or presses an action's shortcut key combination. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#activate(com.trolltech.qt.gui.QAction.ActionEvent) QAction::activate()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAction> hovered = new Signal1<com.trolltech.qt.gui.QAction>();

    private final void hovered(com.trolltech.qt.gui.QAction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hovered_QAction(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_hovered_QAction(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when the given <tt>action</tt> in the action group is activated by the user; for example, when the user clicks a menu option, toolbar button, or presses an action's shortcut key combination. <p>Connect to this signal for command actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#activate(com.trolltech.qt.gui.QAction.ActionEvent) QAction::activate()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAction> triggered = new Signal1<com.trolltech.qt.gui.QAction>();

    private final void triggered(com.trolltech.qt.gui.QAction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggered_QAction(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_triggered_QAction(long __this__nativeId, long arg__1);

/**
Constructs an action group for the <tt>parent</tt> object. <p>The action group is exclusive by default. Call setExclusive(false) to make the action group non-exclusive.
*/

    public QActionGroup(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QActionGroup_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QActionGroup_QObject(long parent);

/**
Returns the list of this groups's actions. This may be empty.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QAction> actions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actions(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QAction> __qt_actions(long __this__nativeId);

/**
Adds the <tt>action</tt> to this group, and returns it. <p>Normally an action is added to a group by creating it with the group as its parent, so this function is not usually used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setActionGroup(com.trolltech.qt.gui.QActionGroup) QAction::setActionGroup()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addAction(com.trolltech.qt.gui.QAction a)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (a != null) {
            __rcActions.add(a);
        }
        com.trolltech.qt.gui.QAction __qt_return_value = __qt_addAction_QAction(nativeId(), a == null ? 0 : a.nativeId());
        com.trolltech.qt.GeneratorUtilities.setField(a, QAction.class, "__rcActionGroup", this);


        return __qt_return_value;
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addAction_QAction(long __this__nativeId, long a);

/**
Creates and returns an action with <tt>text</tt> and an <tt>icon</tt>. The newly created action is a child of this action group. <p>Normally an action is added to a group by creating it with the group as its parent, so this function is not usually used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setActionGroup(com.trolltech.qt.gui.QActionGroup) QAction::setActionGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addAction(com.trolltech.qt.gui.QIcon icon, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addAction_QIcon_String(nativeId(), icon == null ? 0 : icon.nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addAction_QIcon_String(long __this__nativeId, long icon, java.lang.String text);

/**
Creates and returns an action with <tt>text</tt>. The newly created action is a child of this action group. <p>Normally an action is added to a group by creating it with the group as parent, so this function is not usually used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setActionGroup(com.trolltech.qt.gui.QActionGroup) QAction::setActionGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addAction(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addAction_String(nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addAction_String(long __this__nativeId, java.lang.String text);

/**
Returns the currently checked action in the group, or 0 if none are checked.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction checkedAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_checkedAction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_checkedAction(long __this__nativeId);

/**
This property holds whether the action group is enabled. Each action in the group will be enabled or disabled unless it has been explicitly disabled. <p><DT><b>See also:</b><br><DD>{@link QAction#setEnabled(boolean) QAction::setEnabled()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="enabled")
    @QtBlockedSlot
    public final boolean isEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

/**
This property holds whether the action group does exclusive checking. If exclusive is true, only one checkable action in the action group can ever be active at any time. If the user chooses another checkable action in the group, the one they chose becomes active and the one that was active becomes inactive. <p><DT><b>See also:</b><br><DD>{@link QAction#isCheckable() QAction::checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="exclusive")
    @QtBlockedSlot
    public final boolean isExclusive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExclusive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isExclusive(long __this__nativeId);

/**
This property holds whether the action group is visible. Each action in the action group will match the visible state of this group unless it has been explicitly hidden. <p><DT><b>See also:</b><br><DD>{@link QAction#setEnabled(boolean) QAction::setEnabled()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="visible")
    @QtBlockedSlot
    public final boolean isVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisible(long __this__nativeId);

/**
Removes the <tt>action</tt> from this group. The action will have no parent as a result. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setActionGroup(com.trolltech.qt.gui.QActionGroup) QAction::setActionGroup()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeAction(com.trolltech.qt.gui.QAction a)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (a != null) {
            while (__rcActions.remove(a)) ;
        }
        __qt_removeAction_QAction(nativeId(), a == null ? 0 : a.nativeId());
        com.trolltech.qt.GeneratorUtilities.setField(a, QAction.class, "__rcActionGroup", null);


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeAction_QAction(long __this__nativeId, long a);

/**
This is a convenience function for the {@link QActionGroup#isEnabled() enabled} property, that is useful for signals--slots connections. If <tt>b</tt> is true the action group is disabled; otherwise it is enabled.
*/

    public final void setDisabled(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDisabled_boolean(nativeId(), b);
    }
    native void __qt_setDisabled_boolean(long __this__nativeId, boolean b);

/**
This property holds whether the action group is enabled. Each action in the group will be enabled or disabled unless it has been explicitly disabled. <p><DT><b>See also:</b><br><DD>{@link QAction#setEnabled(boolean) QAction::setEnabled()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="enabled")
    public final void setEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), arg__1);
    }
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the action group does exclusive checking. If exclusive is true, only one checkable action in the action group can ever be active at any time. If the user chooses another checkable action in the group, the one they chose becomes active and the one that was active becomes inactive. <p><DT><b>See also:</b><br><DD>{@link QAction#isCheckable() QAction::checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="exclusive")
    public final void setExclusive(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExclusive_boolean(nativeId(), arg__1);
    }
    native void __qt_setExclusive_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the action group is visible. Each action in the action group will match the visible state of this group unless it has been explicitly hidden. <p><DT><b>See also:</b><br><DD>{@link QAction#setEnabled(boolean) QAction::setEnabled()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="visible")
    public final void setVisible(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), arg__1);
    }
    native void __qt_setVisible_boolean(long __this__nativeId, boolean arg__1);

/**
@exclude
*/

    public static native QActionGroup fromNativePointer(QNativePointer nativePointer);

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

    protected QActionGroup(QPrivateConstructor p) { super(p); } 
}
