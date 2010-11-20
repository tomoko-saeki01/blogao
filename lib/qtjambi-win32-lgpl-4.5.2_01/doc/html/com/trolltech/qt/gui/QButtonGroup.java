package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QButtonGroup class provides a container to organize groups of button widgets. QButtonGroup provides an abstract container into which button widgets can be placed. It does not provide a visual representation of this container (see {@link com.trolltech.qt.gui.QGroupBox QGroupBox} for a container widget), but instead manages the states of each of the buttons in the group. <p>An {@link QButtonGroup#exclusive() exclusive} button group switches off all checkable (toggle) buttons except the one that was clicked. By default, a button group is exclusive. The buttons in a button group are usually checkable {@link com.trolltech.qt.gui.QPushButton QPushButton}'s, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}es (normally for non-exclusive button groups), or {@link com.trolltech.qt.gui.QRadioButton QRadioButton}s. If you create an exclusive button group, you should ensure that one of the buttons in the group is initially checked; otherwise, the group will initially be in a state where no buttons are checked. <p>A button is added to the group with {@link com.trolltech.qt.gui.QButtonGroup#addButton(com.trolltech.qt.gui.QAbstractButton) addButton()}. It can be removed from the group with {@link com.trolltech.qt.gui.QButtonGroup#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}. If the group is exclusive, the currently checked button is available as {@link com.trolltech.qt.gui.QButtonGroup#checkedButton() checkedButton()}. If a button is clicked the {@link com.trolltech.qt.gui.QButtonGroup#buttonClicked buttonClicked() } signal is emitted. For a checkable button in an exclusive group this means that the button was checked. The list of buttons in the group is returned by {@link com.trolltech.qt.gui.QButtonGroup#buttons() buttons()}. <p>In addition, QButtonGroup can map between integers and buttons. You can assign an integer id to a button with {@link com.trolltech.qt.gui.QButtonGroup#setId(com.trolltech.qt.gui.QAbstractButton, int) setId()}, and retrieve it with {@link com.trolltech.qt.gui.QButtonGroup#id(com.trolltech.qt.gui.QAbstractButton) id()}. The id of the currently checked button is available with {@link com.trolltech.qt.gui.QButtonGroup#checkedId() checkedId()}, and there is an overloaded signal {@link com.trolltech.qt.gui.QButtonGroup#buttonClicked buttonClicked() } which emits the id of the button. The id <tt>-1</tt> is reserved by QButtonGroup to mean "no such button". The purpose of the mapping mechanism is to simplify the representation of enum values in a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGroupBox QGroupBox}, {@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, and {@link com.trolltech.qt.gui.QRadioButton QRadioButton}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QButtonGroup extends com.trolltech.qt.core.QObject
{

    private java.util.Collection<Object> __rcButtons = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAbstractButton(named: button)&gt;:<p> This signal is emitted when the given <tt>button</tt> is clicked. A button is clicked when it is first pressed and then released, when its shortcut key is typed, or programmatically when {@link com.trolltech.qt.gui.QAbstractButton#click() QAbstractButton::click()} or {@link com.trolltech.qt.gui.QAbstractButton#animateClick() QAbstractButton::animateClick()} is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#checkedButton() checkedButton()}, and {@link com.trolltech.qt.gui.QAbstractButton#clicked QAbstractButton::clicked() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAbstractButton> buttonClicked = new Signal1<com.trolltech.qt.gui.QAbstractButton>();

    private final void buttonClicked(com.trolltech.qt.gui.QAbstractButton arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonClicked_QAbstractButton(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_buttonClicked_QAbstractButton(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: arg__1)&gt;:<p>
*/

    public final Signal1<java.lang.Integer> buttonIdClicked = new Signal1<java.lang.Integer>();

    private final void buttonIdClicked(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonIdClicked_int(nativeId(), arg__1);
    }
    native void __qt_buttonIdClicked_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAbstractButton(named: button)&gt;:<p> This signal is emitted when the given <tt>button</tt> is pressed down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#pressed QAbstractButton::pressed() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAbstractButton> buttonPressed = new Signal1<com.trolltech.qt.gui.QAbstractButton>();

    private final void buttonPressed(com.trolltech.qt.gui.QAbstractButton arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonPressed_QAbstractButton(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_buttonPressed_QAbstractButton(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: arg__1)&gt;:<p>
*/

    public final Signal1<java.lang.Integer> buttonIdPressed = new Signal1<java.lang.Integer>();

    private final void buttonIdPressed(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonIdPressed_int(nativeId(), arg__1);
    }
    native void __qt_buttonIdPressed_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAbstractButton(named: button)&gt;:<p> This signal is emitted when the given <tt>button</tt> is released. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#released QAbstractButton::released() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAbstractButton> buttonReleased = new Signal1<com.trolltech.qt.gui.QAbstractButton>();

    private final void buttonReleased(com.trolltech.qt.gui.QAbstractButton arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonReleased_QAbstractButton(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_buttonReleased_QAbstractButton(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: arg__1)&gt;:<p>
*/

    public final Signal1<java.lang.Integer> buttonIdReleased = new Signal1<java.lang.Integer>();

    private final void buttonIdReleased(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonIdReleased_int(nativeId(), arg__1);
    }
    native void __qt_buttonIdReleased_int(long __this__nativeId, int arg__1);


/**
Constructs a new, empty button group with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#addButton(com.trolltech.qt.gui.QAbstractButton) addButton()}, and {@link com.trolltech.qt.gui.QButtonGroup#setExclusive(boolean) setExclusive()}. <br></DD></DT>
*/

    public QButtonGroup() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new, empty button group with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#addButton(com.trolltech.qt.gui.QAbstractButton) addButton()}, and {@link com.trolltech.qt.gui.QButtonGroup#setExclusive(boolean) setExclusive()}. <br></DD></DT>
*/

    public QButtonGroup(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QButtonGroup_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QButtonGroup_QObject(long parent);

/**
Adds the given <tt>button</tt> to the end of the group's internal list of buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addButton(com.trolltech.qt.gui.QAbstractButton arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        if (arg__1 != null) {
            __rcButtons.add(arg__1);
        }
        __qt_addButton_QAbstractButton(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addButton_QAbstractButton(long __this__nativeId, long arg__1);

/**
Adds the given <tt>button</tt> to the button group, with the given <tt>id</tt>. If <tt>id</tt> is -1 (the default), an id will be assigned to the button by this QButtonGroup. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}, and {@link com.trolltech.qt.gui.QButtonGroup#buttons() buttons()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addButton(com.trolltech.qt.gui.QAbstractButton arg__1, int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        if (arg__1 != null) {
            __rcButtons.add(arg__1);
        }
        __qt_addButton_QAbstractButton_int(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), id);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addButton_QAbstractButton_int(long __this__nativeId, long arg__1, int id);

/**
Returns the button with the specified <tt>id</tt>, or 0 if no such button exists.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractButton button(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_button_int(nativeId(), id);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractButton __qt_button_int(long __this__nativeId, int id);

/**
Returns the list of this groups's buttons. This may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#addButton(com.trolltech.qt.gui.QAbstractButton) addButton()}, and {@link com.trolltech.qt.gui.QButtonGroup#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QAbstractButton> buttons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buttons(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QAbstractButton> __qt_buttons(long __this__nativeId);

/**
Returns the button group's checked button, or 0 if no buttons are checked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#buttonClicked buttonClicked() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractButton checkedButton()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_checkedButton(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractButton __qt_checkedButton(long __this__nativeId);

/**
Returns the id of the {@link com.trolltech.qt.gui.QButtonGroup#checkedButton() checkedButton()}, or -1 if no button is checked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#setId(com.trolltech.qt.gui.QAbstractButton, int) setId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int checkedId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_checkedId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_checkedId(long __this__nativeId);

/**
This property holds whether the button group is exclusive. If this property is true then only one button in the group can be checked at any given time. The user can click on any button to check it, and that button will replace the existing one as the checked button in the group. <p>In an exclusive group, the user cannot uncheck the currently checked button by clicking on it; instead, another button in the group must be clicked to set the new checked button for that group. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="exclusive")
    @QtBlockedSlot
    public final boolean exclusive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exclusive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_exclusive(long __this__nativeId);

/**
Returns the id for the specified <tt>button</tt>, or -1 if no such button exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#setId(com.trolltech.qt.gui.QAbstractButton, int) setId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int id(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_id_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    @QtBlockedSlot
    native int __qt_id_QAbstractButton(long __this__nativeId, long button);

/**
Removes the given <tt>button</tt> from the button group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#addButton(com.trolltech.qt.gui.QAbstractButton) addButton()}, and {@link com.trolltech.qt.gui.QButtonGroup#buttons() buttons()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeButton(com.trolltech.qt.gui.QAbstractButton arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        if (arg__1 != null) {
            while (__rcButtons.remove(arg__1)) ;
        }
        __qt_removeButton_QAbstractButton(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeButton_QAbstractButton(long __this__nativeId, long arg__1);

/**
This property holds whether the button group is exclusive. If this property is true then only one button in the group can be checked at any given time. The user can click on any button to check it, and that button will replace the existing one as the checked button in the group. <p>In an exclusive group, the user cannot uncheck the currently checked button by clicking on it; instead, another button in the group must be clicked to set the new checked button for that group. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="exclusive")
    @QtBlockedSlot
    public final void setExclusive(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExclusive_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setExclusive_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the <tt>id</tt> for the specified <tt>button</tt>. Note that <tt>id</tt> can not be -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup#id(com.trolltech.qt.gui.QAbstractButton) id()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setId(com.trolltech.qt.gui.QAbstractButton button, int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setId_QAbstractButton_int(nativeId(), button == null ? 0 : button.nativeId(), id);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setId_QAbstractButton_int(long __this__nativeId, long button, int id);

/**
@exclude
*/

    public static native QButtonGroup fromNativePointer(QNativePointer nativePointer);

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

    protected QButtonGroup(QPrivateConstructor p) { super(p); } 
}
