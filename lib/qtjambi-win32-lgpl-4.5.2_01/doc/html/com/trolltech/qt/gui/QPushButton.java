package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPushButton widget provides a command button. The push button, or command button, is perhaps the most commonly used widget in any graphical user interface. Push (click) a button to command the computer to perform some action, or to answer a question. Typical buttons are OK, Apply, Cancel, Close, Yes, No and Help. <p>A command button is rectangular and typically displays a text label describing its action. A shortcut key can be specified by preceding the preferred character with an ampersand in the text. For example: <pre class="snippet">
        QPushButton button = new QPushButton("Download");
</pre> In this example the shortcut is Alt+D. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>Push buttons display a textual label, and optionally a small icon. These can be set using the constructors and changed later using setText() and setIcon(). If the button is disabled the appearance of the text and icon will be manipulated with respect to the GUI style to make the button look "disabled". <p>A push button emits the signal {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() } when it is activated by the mouse, the Spacebar or by a keyboard shortcut. Connect to this signal to perform the button's action. Push buttons also provide less commonly used signals, for example, {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() } and {@link com.trolltech.qt.gui.QAbstractButton#released released() }. <p>Command buttons in dialogs are by default auto-default buttons, i.e. they become the default push button automatically when they receive the keyboard input focus. A default button is a push button that is activated when the user presses the Enter or Return key in a dialog. You can change this with {@link com.trolltech.qt.gui.QPushButton#setAutoDefault(boolean) setAutoDefault()}. Note that auto-default buttons reserve a little extra space which is necessary to draw a default-button indicator. If you do not want this space around your buttons, call setAutoDefault(false). <p>Being so central, the button widget has grown to accommodate a great many variations in the past decade. The Microsoft style guide now shows about ten different states of Windows push buttons and the text implies that there are dozens more when all the combinations of features are taken into consideration. <p>The most important modes or states are: <ul><li> Available or not (grayed out, disabled).</li><li> Standard push button, toggling push button or menu button.</li><li> On or off (only for toggling push buttons).</li><li> Default or normal. The default button in a dialog can generally be "clicked" using the Enter or Return key.</li><li> Auto-repeat or not.</li><li> Pressed down or not.</li></ul> As a general rule, use a push button when the application or dialog window performs an action when the user clicks on it (such as Apply, Cancel, Close and Help) and when the widget is supposed to have a wide, rectangular shape with a text label. Small, typically square buttons that change the state of the window rather than performing an action (such as the buttons in the top-right corner of the {@link com.trolltech.qt.gui.QFileDialog QFileDialog}) are not command buttons, but tool buttons. Qt provides a special class ({@link com.trolltech.qt.gui.QToolButton QToolButton}) for these buttons. <p>If you need toggle behavior (see setCheckable()) or a button that auto-repeats the activation signal when being pushed down like the arrows in a scroll bar (see setAutoRepeat()), a command button is probably not what you want. When in doubt, use a tool button. <p>A variation of a command button is a menu button. These provide not just one command, but several, since when they are clicked they pop up a menu of options. Use the method {@link com.trolltech.qt.gui.QPushButton#setMenu(com.trolltech.qt.gui.QMenu) setMenu()} to associate a popup menu with a push button. <p>Other classes of buttons are option buttons (see {@link com.trolltech.qt.gui.QRadioButton QRadioButton}) and check boxes (see {@link com.trolltech.qt.gui.QCheckBox QCheckBox}). <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-pushbutton.png"></center><br></td><td> A push button shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}. <p>Note that when a button's width becomes smaller than 50 or its height becomes smaller than 30, the button's corners are changed from round to square. Use the setMinimumSize() function to prevent this behavior.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windowsxp-pushbutton.png"></center><br></td><td> A push button shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-pushbutton.png"></center><br></td><td> A push button shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> In Qt, the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} base class provides most of the modes and other API, and QPushButton provides GUI logic. See {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} for more information about the API. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolButton QToolButton}, {@link com.trolltech.qt.gui.QRadioButton QRadioButton}, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, and {@link <a href="../guibooks.html">GUI Design Handbook: Push Button</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPushButton extends com.trolltech.qt.gui.QAbstractButton
{

    private Object __rcMenu = null;


/**
Constructs a push button with no text and a <tt>parent</tt>.
*/

    public QPushButton() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a push button with no text and a <tt>parent</tt>.
*/

    public QPushButton(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPushButton_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPushButton_QWidget(long parent);


/**
Constructs a push button with an <tt>icon</tt> and a <tt>text</tt>, and a <tt>parent</tt>. <p>Note that you can also pass a {@link com.trolltech.qt.gui.QPixmap QPixmap} object as an icon (thanks to the implicit type conversion provided by C++).
*/

    public QPushButton(com.trolltech.qt.gui.QIcon icon, java.lang.String text) {
        this(icon, text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a push button with an <tt>icon</tt> and a <tt>text</tt>, and a <tt>parent</tt>. <p>Note that you can also pass a {@link com.trolltech.qt.gui.QPixmap QPixmap} object as an icon (thanks to the implicit type conversion provided by C++).
*/

    public QPushButton(com.trolltech.qt.gui.QIcon icon, java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPushButton_QIcon_String_QWidget(icon == null ? 0 : icon.nativeId(), text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPushButton_QIcon_String_QWidget(long icon, java.lang.String text, long parent);


/**
Constructs a push button with the parent <tt>parent</tt> and the text <tt>text</tt>.
*/

    public QPushButton(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a push button with the parent <tt>parent</tt> and the text <tt>text</tt>.
*/

    public QPushButton(java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPushButton_String_QWidget(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPushButton_String_QWidget(java.lang.String text, long parent);

/**
This property holds whether the push button is an auto default button. If this property is set to true then the push button is an auto default button. <p>In some GUI styles a default button is drawn with an extra frame around it, up to 3 pixels or more. Qt automatically keeps this space free around auto-default buttons, i.e. auto-default buttons may have a slightly larger size hint. <p>This property's default is true for buttons that have a {@link com.trolltech.qt.gui.QDialog QDialog} parent; otherwise it defaults to false. <p>See the {@link QPushButton#isDefault() default} property for details of how {@link QPushButton#isDefault() default} and auto-default interact.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoDefault")
    @QtBlockedSlot
    public final boolean autoDefault()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoDefault(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoDefault(long __this__nativeId);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
This property holds whether the push button is the default button. Default and autodefault buttons decide what happens when the user presses enter in a dialog. <p>A button with this property set to true (i.e., the dialog's default button,) will automatically be pressed when the user presses enter, with one exception: if an <tt>autoDefault</tt> button currently has focus, the {@link QPushButton#autoDefault() autoDefault} button is pressed. When the dialog has {@link QPushButton#autoDefault() autoDefault} buttons but no default button, pressing enter will press either the {@link QPushButton#autoDefault() autoDefault} button that currently has focus, or if no button has focus, the next {@link QPushButton#autoDefault() autoDefault} button in the focus chain. <p>In a dialog, only one push button at a time can be the default button. This button is then displayed with an additional frame (depending on the GUI style). <p>The default button behavior is provided only in dialogs. Buttons can always be clicked from the keyboard by pressing Spacebar when the button has focus. <p>If the default property is set to false on the current default button while the dialog is visible, a new default will automatically be assigned the next time a pushbutton in the dialog receives focus. <p>This property's default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="default")
    @QtBlockedSlot
    public final boolean isDefault()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDefault(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDefault(long __this__nativeId);

/**
This property holds whether the button border is raised. This property's default is false. If this property is set, most styles will not paint the button background unless the button is being pressed. setAutoFillBackground() can be used to ensure that the background is filled using the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Button } brush.
*/

    @com.trolltech.qt.QtPropertyReader(name="flat")
    @QtBlockedSlot
    public final boolean isFlat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFlat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFlat(long __this__nativeId);

/**
Returns the button's associated popup menu or 0 if no popup menu has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPushButton#setMenu(com.trolltech.qt.gui.QMenu) setMenu()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu menu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_menu(long __this__nativeId);

/**
This property holds whether the push button is an auto default button. If this property is set to true then the push button is an auto default button. <p>In some GUI styles a default button is drawn with an extra frame around it, up to 3 pixels or more. Qt automatically keeps this space free around auto-default buttons, i.e. auto-default buttons may have a slightly larger size hint. <p>This property's default is true for buttons that have a {@link com.trolltech.qt.gui.QDialog QDialog} parent; otherwise it defaults to false. <p>See the {@link QPushButton#isDefault() default} property for details of how {@link QPushButton#isDefault() default} and auto-default interact.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoDefault")
    @QtBlockedSlot
    public final void setAutoDefault(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoDefault_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoDefault_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the push button is the default button. Default and autodefault buttons decide what happens when the user presses enter in a dialog. <p>A button with this property set to true (i.e., the dialog's default button,) will automatically be pressed when the user presses enter, with one exception: if an <tt>autoDefault</tt> button currently has focus, the {@link QPushButton#autoDefault() autoDefault} button is pressed. When the dialog has {@link QPushButton#autoDefault() autoDefault} buttons but no default button, pressing enter will press either the {@link QPushButton#autoDefault() autoDefault} button that currently has focus, or if no button has focus, the next {@link QPushButton#autoDefault() autoDefault} button in the focus chain. <p>In a dialog, only one push button at a time can be the default button. This button is then displayed with an additional frame (depending on the GUI style). <p>The default button behavior is provided only in dialogs. Buttons can always be clicked from the keyboard by pressing Spacebar when the button has focus. <p>If the default property is set to false on the current default button while the dialog is visible, a new default will automatically be assigned the next time a pushbutton in the dialog receives focus. <p>This property's default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="default")
    @QtBlockedSlot
    public final void setDefault(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefault_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDefault_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the button border is raised. This property's default is false. If this property is set, most styles will not paint the button background unless the button is being pressed. setAutoFillBackground() can be used to ensure that the background is filled using the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Button } brush.
*/

    @com.trolltech.qt.QtPropertyWriter(name="flat")
    @QtBlockedSlot
    public final void setFlat(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlat_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFlat_boolean(long __this__nativeId, boolean arg__1);

/**
Associates the popup menu <tt>menu</tt> with this push button. This turns the button into a menu button, which in some styles will produce a small triangle to the right of the button's text. <p>Ownership of the menu is not transferred to the push button. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-pushbutton-menu.png"></center><br></td><td>  <br><center><img src="../images/cleanlooks-pushbutton-menu.png"></center><br></td><td> Push buttons with popup menus shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>} (left) and {@link <a href="../gallery-cleanlooks.html">Cleanlooks widget style</a>} (right).</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPushButton#menu() menu()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMenu(com.trolltech.qt.gui.QMenu menu)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcMenu = menu;
        }
        __qt_setMenu_QMenu(nativeId(), menu == null ? 0 : menu.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMenu_QMenu(long __this__nativeId, long menu);

/**
Shows (pops up) the associated popup menu. If there is no such menu, this function does nothing. This function does not return until the popup menu has been closed by the user.
*/

    public final void showMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMenu(nativeId());
    }
    native void __qt_showMenu(long __this__nativeId);

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
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QPushButton fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPushButton(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QPushButton. This
method is useful for subclasses when they need a QStyleOptionButton,
but don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionButton option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
