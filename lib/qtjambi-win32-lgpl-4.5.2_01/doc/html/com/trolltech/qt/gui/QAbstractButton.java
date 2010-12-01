package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractButton class is the abstract base class of button widgets, providing functionality common to buttons. This class implements an abstract button. Subclasses of this class handle user actions, and specify how the button is drawn. <p>QAbstractButton provides support for both push buttons and checkable (toggle) buttons. Checkable buttons are implemented in the {@link com.trolltech.qt.gui.QRadioButton QRadioButton} and {@link com.trolltech.qt.gui.QCheckBox QCheckBox} classes. Push buttons are implemented in the {@link com.trolltech.qt.gui.QPushButton QPushButton} and {@link com.trolltech.qt.gui.QToolButton QToolButton} classes; these also provide toggle behavior if required. <p>Any button can display a label containing text and an icon. {@link com.trolltech.qt.gui.QAbstractButton#setText(java.lang.String) setText()} sets the text; {@link com.trolltech.qt.gui.QAbstractButton#setIcon(com.trolltech.qt.gui.QIcon) setIcon()} sets the icon. If a button is disabled, its label is changed to give the button a "disabled" appearance. <p>If the button is a text button with a string containing an ampersand ('&'), QAbstractButton automatically creates a shortcut key. For example: <pre class="snippet">
        QPushButton button = new QPushButton(tr("Ro&ck && Roll"));
</pre> The <b>Alt+C</b> shortcut is assigned to the button, i.e., when the user presses <b>Alt+C</b> the button will call {@link com.trolltech.qt.gui.QAbstractButton#animateClick() animateClick()}. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>You can also set a custom shortcut key using the {@link com.trolltech.qt.gui.QAbstractButton#setShortcut(com.trolltech.qt.gui.QKeySequence) setShortcut()} function. This is useful mostly for buttons that do not have any text, because they have no automatic shortcut. <pre class="snippet">
        button.setIcon(new QIcon(":/images/print.png"));
        button.setShortcut(tr("Alt+F7"));
</pre> All of the buttons provided by Qt ({@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QToolButton QToolButton}, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, and {@link com.trolltech.qt.gui.QRadioButton QRadioButton}) can display both {@link QAbstractButton#text() text} and {@link QAbstractButton#icon() icons}. <p>A button can be made the default button in a dialog are provided by {@link QPushButton#setDefault(boolean) QPushButton::setDefault()} and {@link QPushButton#setAutoDefault(boolean) QPushButton::setAutoDefault()}. <p>QAbstractButton provides most of the states used for buttons: <ul><li> {@link com.trolltech.qt.gui.QAbstractButton#isDown() isDown()} indicates whether the button is pressed down.</li><li> {@link com.trolltech.qt.gui.QAbstractButton#isChecked() isChecked()} indicates whether the button is checked. Only checkable buttons can be checked and unchecked (see below).</li><li> isEnabled() indicates whether the button can be pressed by the user.</li><li> {@link com.trolltech.qt.gui.QAbstractButton#setAutoRepeat(boolean) setAutoRepeat()} sets whether the button will auto-repeat if the user holds it down. {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay} and {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval} define how auto-repetition is done.</li><li> {@link com.trolltech.qt.gui.QAbstractButton#setCheckable(boolean) setCheckable()} sets whether the button is a toggle button or not.</li></ul> The difference between {@link com.trolltech.qt.gui.QAbstractButton#isDown() isDown()} and {@link com.trolltech.qt.gui.QAbstractButton#isChecked() isChecked()} is as follows. When the user clicks a toggle button to check it, the button is first pressed then released into the checked state. When the user clicks it again (to uncheck it), the button moves first to the pressed state, then to the unchecked state ({@link com.trolltech.qt.gui.QAbstractButton#isChecked() isChecked()} and {@link com.trolltech.qt.gui.QAbstractButton#isDown() isDown()} are both false). <p>QAbstractButton provides four signals: <ol><li> {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() } is emitted when the left mouse button is pressed while the mouse cursor is inside the button.</li><li> {@link com.trolltech.qt.gui.QAbstractButton#released released() } is emitted when the left mouse button is released.</li><li> {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } is emitted when the button is first pressed and then released, when the shortcut key is typed, or when {@link com.trolltech.qt.gui.QAbstractButton#click() click()} or {@link com.trolltech.qt.gui.QAbstractButton#animateClick() animateClick()} is called.</li><li> {@link com.trolltech.qt.gui.QAbstractButton#toggled toggled() } is emitted when the state of a toggle button changes.</li></ol> To subclass QAbstractButton, you must reimplement at least {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} to draw the button's outline and its text or pixmap. It is generally advisable to reimplement sizeHint() as well, and sometimes {@link com.trolltech.qt.gui.QAbstractButton#hitButton(com.trolltech.qt.core.QPoint) hitButton()} (to determine whether a button press is within the button). For buttons with more than two states (like tri-state buttons), you will also have to reimplement {@link com.trolltech.qt.gui.QAbstractButton#checkStateSet() checkStateSet()} and {@link com.trolltech.qt.gui.QAbstractButton#nextCheckState() nextCheckState()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractButton extends com.trolltech.qt.gui.QWidget
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractButton {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
        }
    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: checked)&gt;:<p> This signal is emitted when the button is activated (i. . pressed down then released while the mouse cursor is inside the button), when the shortcut key is typed, or when {@link com.trolltech.qt.gui.QAbstractButton#click() click()} or {@link com.trolltech.qt.gui.QAbstractButton#animateClick() animateClick()} is called. Notably, this signal is not emitted if you call {@link com.trolltech.qt.gui.QAbstractButton#setDown(boolean) setDown()}, {@link com.trolltech.qt.gui.QAbstractButton#setChecked(boolean) setChecked()} or {@link com.trolltech.qt.gui.QAbstractButton#toggle() toggle()}. <p>If the button is checkable, <tt>checked</tt> is true if the button is checked, or false if the button is unchecked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, and {@link com.trolltech.qt.gui.QAbstractButton#toggled toggled() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> clicked = new Signal1<java.lang.Boolean>();


    private final void clicked() {
        clicked((boolean)false);
    }
    private final void clicked(boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clicked_boolean(nativeId(), checked);
    }
    native void __qt_clicked_boolean(long __this__nativeId, boolean checked);
/**
 This signal is emitted when the button is pressed down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#released released() }, and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() }. <br></DD></DT>
*/

    public final Signal0 pressed = new Signal0();

    private final void pressed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pressed(nativeId());
    }
    native void __qt_pressed(long __this__nativeId);
/**
 This signal is emitted when the button is released. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() }, and {@link com.trolltech.qt.gui.QAbstractButton#toggled toggled() }. <br></DD></DT>
*/

    public final Signal0 released = new Signal0();

    private final void released()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_released(nativeId());
    }
    native void __qt_released(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: checked)&gt;:<p> This signal is emitted whenever a checkable button changes its state. <tt>checked</tt> is true if the button is checked, or false if the button is unchecked. <p>This may be the result of a user action, {@link com.trolltech.qt.gui.QAbstractButton#click() click()} slot activation, or because {@link com.trolltech.qt.gui.QAbstractButton#setChecked(boolean) setChecked()} was called. <p>The states of buttons in exclusive button groups are updated before this signal is emitted. This means that slots can act on either the "off" signal or the "on" signal emitted by the buttons in the group whose states have changed. <p>For example, a slot that reacts to signals emitted by newly checked buttons but which ignores signals from buttons that have been unchecked can be implemented using the following pattern: <pre class="snippet">
void reactToToggle(boolean checked)
{
   if (checked) {
      // Examine the new button states ...
   }
}
</pre> Button groups can be created using the {@link com.trolltech.qt.gui.QButtonGroup QButtonGroup} class, and updates to the button states monitored with the {@link com.trolltech.qt.gui.QButtonGroup#buttonClicked QButtonGroup::buttonClicked() } signal. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#isChecked() checked}, and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> toggled = new Signal1<java.lang.Boolean>();

    private final void toggled(boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toggled_boolean(nativeId(), checked);
    }
    native void __qt_toggled_boolean(long __this__nativeId, boolean checked);


/**
Constructs an abstract button with a <tt>parent</tt>.
*/

    public QAbstractButton() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an abstract button with a <tt>parent</tt>.
*/

    public QAbstractButton(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractButton_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractButton_QWidget(long parent);


/**
Performs an animated click. the button is pressed immediately, and released <tt>msec</tt> milliseconds later (the default is 100 ms). <p>Calling this function again before the button was released will reset the release timer. <p>All signals associated with a click are emitted as appropriate. <p>This function does nothing if the button is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#click() click()}. <br></DD></DT>
*/

    public final void animateClick() {
        animateClick((int)100);
    }
/**
Performs an animated click. the button is pressed immediately, and released <tt>msec</tt> milliseconds later (the default is 100 ms). <p>Calling this function again before the button was released will reset the release timer. <p>All signals associated with a click are emitted as appropriate. <p>This function does nothing if the button is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#click() click()}. <br></DD></DT>
*/

    public final void animateClick(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_animateClick_int(nativeId(), msec);
    }
    native void __qt_animateClick_int(long __this__nativeId, int msec);

/**
This property holds whether auto-exclusivity is enabled. If auto-exclusivity is enabled, checkable buttons that belong to the same parent widget behave as if they were part of the same exclusive button group. In an exclusive button group, only one button can be checked at any time; checking another button automatically unchecks the previously checked one. <p>The property has no effect on buttons that belong to a button group. <p>{@link QAbstractButton#autoExclusive() autoExclusive} is off by default, except for radio buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadioButton QRadioButton}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="autoExclusive")
    @QtBlockedSlot
    public final boolean autoExclusive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoExclusive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoExclusive(long __this__nativeId);

/**
This property holds whether {@link QAbstractButton#autoRepeat() autoRepeat} is enabled. If {@link QAbstractButton#autoRepeat() autoRepeat} is enabled, then the {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } signals are emitted at regular intervals when the button is down. {@link QAbstractButton#autoRepeat() autoRepeat} is off by default. The initial delay and the repetition interval are defined in milliseconds by {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay} and {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval}. <p>Note: If a button is pressed down by a shortcut key, then auto-repeat is enabled and timed by the system and not by this class. The {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } signals will be emitted like in the normal case.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoRepeat")
    @QtBlockedSlot
    public final boolean autoRepeat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRepeat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoRepeat(long __this__nativeId);

/**
This property holds the initial delay of auto-repetition. If {@link QAbstractButton#autoRepeat() autoRepeat} is enabled, then {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay} defines the initial delay in milliseconds before auto-repetition kicks in. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#autoRepeat() autoRepeat}, and {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="autoRepeatDelay")
    @QtBlockedSlot
    public final int autoRepeatDelay()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRepeatDelay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_autoRepeatDelay(long __this__nativeId);

/**
This property holds the interval of auto-repetition. If {@link QAbstractButton#autoRepeat() autoRepeat} is enabled, then {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval} defines the length of the auto-repetition interval in millisecons. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#autoRepeat() autoRepeat}, and {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="autoRepeatInterval")
    @QtBlockedSlot
    public final int autoRepeatInterval()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRepeatInterval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_autoRepeatInterval(long __this__nativeId);

/**
Performs a click. <p>All the usual signals associated with a click are emitted as appropriate. If the button is checkable, the state of the button is toggled. <p>This function does nothing if the button is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#animateClick() animateClick()}. <br></DD></DT>
*/

    public final void click()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_click(nativeId());
    }
    native void __qt_click(long __this__nativeId);

/**
Returns the group that this button belongs to. <p>If the button is not a member of any {@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}, this function returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QButtonGroup group()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_group(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QButtonGroup __qt_group(long __this__nativeId);

/**
This property holds the icon shown on the button. The icon's default size is defined by the GUI style, but can be adjusted by setting the {@link QAbstractButton#iconSize() iconSize} property.
*/

    @com.trolltech.qt.QtPropertyReader(name="icon")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
This property holds the icon size used for this button.  The default size is defined by the GUI style. This is a maximum size for the icons. Smaller icons will not be scaled up.
*/

    @com.trolltech.qt.QtPropertyReader(name="iconSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
This property holds whether the button is checkable. By default, the button is not checkable. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#isChecked() checked}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="checkable")
    @QtBlockedSlot
    public final boolean isCheckable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCheckable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCheckable(long __this__nativeId);

/**
This property holds whether the button is checked. Only checkable buttons can be checked. By default, the button is unchecked. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#isCheckable() checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="checked")
    @com.trolltech.qt.QtPropertyDesignable("isCheckable")
    @QtBlockedSlot
    public final boolean isChecked()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isChecked(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isChecked(long __this__nativeId);

/**
This property holds whether the button is pressed down. If this property is true, the button is pressed down. The signals {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() } and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } are not emitted if you set this property to true. The default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="down")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean isDown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDown(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDown(long __this__nativeId);

/**
This property holds whether auto-exclusivity is enabled. If auto-exclusivity is enabled, checkable buttons that belong to the same parent widget behave as if they were part of the same exclusive button group. In an exclusive button group, only one button can be checked at any time; checking another button automatically unchecks the previously checked one. <p>The property has no effect on buttons that belong to a button group. <p>{@link QAbstractButton#autoExclusive() autoExclusive} is off by default, except for radio buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadioButton QRadioButton}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoExclusive")
    @QtBlockedSlot
    public final void setAutoExclusive(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoExclusive_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoExclusive_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether {@link QAbstractButton#autoRepeat() autoRepeat} is enabled. If {@link QAbstractButton#autoRepeat() autoRepeat} is enabled, then the {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } signals are emitted at regular intervals when the button is down. {@link QAbstractButton#autoRepeat() autoRepeat} is off by default. The initial delay and the repetition interval are defined in milliseconds by {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay} and {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval}. <p>Note: If a button is pressed down by a shortcut key, then auto-repeat is enabled and timed by the system and not by this class. The {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } signals will be emitted like in the normal case.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoRepeat")
    @QtBlockedSlot
    public final void setAutoRepeat(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRepeat_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoRepeat_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the initial delay of auto-repetition. If {@link QAbstractButton#autoRepeat() autoRepeat} is enabled, then {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay} defines the initial delay in milliseconds before auto-repetition kicks in. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#autoRepeat() autoRepeat}, and {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoRepeatDelay")
    @QtBlockedSlot
    public final void setAutoRepeatDelay(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRepeatDelay_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoRepeatDelay_int(long __this__nativeId, int arg__1);

/**
This property holds the interval of auto-repetition. If {@link QAbstractButton#autoRepeat() autoRepeat} is enabled, then {@link QAbstractButton#autoRepeatInterval() autoRepeatInterval} defines the length of the auto-repetition interval in millisecons. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#autoRepeat() autoRepeat}, and {@link QAbstractButton#autoRepeatDelay() autoRepeatDelay}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoRepeatInterval")
    @QtBlockedSlot
    public final void setAutoRepeatInterval(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRepeatInterval_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoRepeatInterval_int(long __this__nativeId, int arg__1);

/**
This property holds whether the button is checkable. By default, the button is not checkable. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#isChecked() checked}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="checkable")
    @QtBlockedSlot
    public final void setCheckable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckable_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setCheckable_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the button is checked. Only checkable buttons can be checked. By default, the button is unchecked. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#isCheckable() checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="checked")
    public final void setChecked(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChecked_boolean(nativeId(), arg__1);
    }
    native void __qt_setChecked_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the button is pressed down. If this property is true, the button is pressed down. The signals {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() } and {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } are not emitted if you set this property to true. The default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="down")
    @QtBlockedSlot
    public final void setDown(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDown_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDown_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the icon shown on the button. The icon's default size is defined by the GUI style, but can be adjusted by setting the {@link QAbstractButton#iconSize() iconSize} property.
*/

    @com.trolltech.qt.QtPropertyWriter(name="icon")
    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
This property holds the icon size used for this button.  The default size is defined by the GUI style. This is a maximum size for the icons. Smaller icons will not be scaled up.
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconSize")
    public final void setIconSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    native void __qt_setIconSize_QSize(long __this__nativeId, long size);

/**
This property holds the mnemonic associated with the button.
*/

    @com.trolltech.qt.QtPropertyWriter(name="shortcut")
    @QtBlockedSlot
    public final void setShortcut(com.trolltech.qt.gui.QKeySequence key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcut_QKeySequence(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setShortcut_QKeySequence(long __this__nativeId, long key);

/**
This property holds the text shown on the button. If the button has no text, the {@link com.trolltech.qt.gui.QAbstractButton#text() text()} function will return a an empty string. <p>If the text contains an ampersand character ('&'), a shortcut is automatically created for it. The character that follows the '&' will be used as the shortcut key. Any previous shortcut will be overwritten, or cleared if no shortcut is defined by the text. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>There is no default text.
*/

    @com.trolltech.qt.QtPropertyWriter(name="text")
    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
This property holds the mnemonic associated with the button.
*/

    @com.trolltech.qt.QtPropertyReader(name="shortcut")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QKeySequence shortcut()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shortcut(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QKeySequence __qt_shortcut(long __this__nativeId);

/**
This property holds the text shown on the button. If the button has no text, the {@link com.trolltech.qt.gui.QAbstractButton#text() text()} function will return a an empty string. <p>If the text contains an ampersand character ('&'), a shortcut is automatically created for it. The character that follows the '&' will be used as the shortcut key. Any previous shortcut will be overwritten, or cleared if no shortcut is defined by the text. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>There is no default text.
*/

    @com.trolltech.qt.QtPropertyReader(name="text")
    @QtBlockedSlot
    public final java.lang.String text()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Toggles the state of a checkable button. <p><DT><b>See also:</b><br><DD>{@link QAbstractButton#isChecked() checked}. <br></DD></DT>
*/

    public final void toggle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toggle(nativeId());
    }
    native void __qt_toggle(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long e);

/**
This virtual handler is called when {@link com.trolltech.qt.gui.QAbstractButton#setChecked(boolean) setChecked()} was called, unless it was called from within {@link com.trolltech.qt.gui.QAbstractButton#nextCheckState() nextCheckState()}. It allows subclasses to reset their intermediate button states. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#nextCheckState() nextCheckState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void checkStateSet()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_checkStateSet(nativeId());
    }
    @QtBlockedSlot
    native void __qt_checkStateSet(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long e);

/**
Returns true if <tt>pos</tt> is inside the clickable button rectangle; otherwise returns false. <p>By default, the clickable area is the entire widget. Subclasses may reimplement this function to provide support for clickable areas of different shapes and sizes.
*/

    @QtBlockedSlot
    protected boolean hitButton(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hitButton_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hitButton_QPoint(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long e);

/**
This virtual handler is called when a button is clicked. The default implementation calls setChecked(!{@link com.trolltech.qt.gui.QAbstractButton#isChecked() isChecked()}) if the button {@link com.trolltech.qt.gui.QAbstractButton#isCheckable() isCheckable()}. It allows subclasses to implement intermediate button states. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton#checkStateSet() checkStateSet()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void nextCheckState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_nextCheckState(nativeId());
    }
    @QtBlockedSlot
    native void __qt_nextCheckState(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected abstract void paintEvent(com.trolltech.qt.gui.QPaintEvent e);
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QAbstractButton fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractButton(QPrivateConstructor p) { super(p); } 

    /**
     * Sets the shortcut to the key sequence for the given key string. For
     * example "Ctrl+O" gives CTRL+'O'. The strings "Ctrl", "Shift", "Alt" and
     * "Meta" are recognized, as well as their translated equivalents in the
     * "QShortcut" context (using QObject::tr()). Up to four key codes may be
     * entered by separating them with commas, e.g. "Alt+X,Ctrl+S,Q".
     *
     * @param key
     *            The description of the key sequence. Typically used with tr()
     *            so key sequences can be locale aware.
     */
    public final void setShortcut(String key) {
        setShortcut(new QKeySequence(key));
    }

    /**
     * Sets the shortcut to the key sequence for the given key. The result will
     * depend on the currently running platform. The key sequence will be based
     * on the first element in the list of key bindings for the key.
     *
     * @param key
     *            The key for which to select a key sequence
     */
    public final void setShortcut(QKeySequence.StandardKey key) {
        setShortcut(new QKeySequence(key));
    }

}
