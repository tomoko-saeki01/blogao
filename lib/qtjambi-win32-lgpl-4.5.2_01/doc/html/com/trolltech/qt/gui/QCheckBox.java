package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCheckBox widget provides a checkbox with a text label. A QCheckBox is an option button that can be switched on (checked) or off (unchecked). Checkboxes are typically used to represent features in an application that can be enabled or disabled without affecting others, but different types of behavior can be implemented. <p>A {@link com.trolltech.qt.gui.QButtonGroup QButtonGroup} can be used to group check buttons visually. <p>Whenever a checkbox is checked or cleared it emits the signal {@link com.trolltech.qt.gui.QCheckBox#stateChanged stateChanged() }. Connect to this signal if you want to trigger an action each time the checkbox changes state. You can use isChecked() to query whether or not a checkbox is checked. <p>In addition to the usual checked and unchecked states, QCheckBox optionally provides a third state to indicate "no change". This is useful whenever you need to give the user the option of neither checking nor unchecking a checkbox. If you need this third state, enable it with {@link com.trolltech.qt.gui.QCheckBox#setTristate() setTristate()}, and use {@link com.trolltech.qt.gui.QCheckBox#checkState() checkState()} to query the current toggle state. <p>Just like {@link com.trolltech.qt.gui.QPushButton QPushButton}, a checkbox displays text, and optionally a small icon. The icon is set with setIcon(). The text can be set in the constructor or with setText(). A shortcut key can be specified by preceding the preferred character with an ampersand. For example: <pre class="snippet">
        QCheckBox checkbox = new QCheckBox("C&ase sensitive", this);
</pre> In this example the shortcut is Alt+A. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>Important inherited functions: text(), setText(), text(), pixmap(), setPixmap(), accel(), setAccel(), isToggleButton(), setDown(), isDown(), isOn(), {@link com.trolltech.qt.gui.QCheckBox#checkState() checkState()}, autoRepeat(), isExclusiveToggle(), {@link com.trolltech.qt.gui.QAbstractButton#group() group()}, setAutoRepeat(), {@link com.trolltech.qt.gui.QAbstractButton#toggle() toggle()}, {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() }, {@link com.trolltech.qt.gui.QAbstractButton#toggled toggled() }, {@link com.trolltech.qt.gui.QCheckBox#checkState() checkState()}, and {@link com.trolltech.qt.gui.QCheckBox#stateChanged stateChanged() }. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-checkbox.png"></center><br></td><td> A checkbox shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windows-checkbox.png"></center><br></td><td> A checkbox shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-checkbox.png"></center><br></td><td> A checkbox shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractButton QAbstractButton}, {@link com.trolltech.qt.gui.QRadioButton QRadioButton}, and {@link <a href="../guibooks.html">GUI Design Handbook: Check Box</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCheckBox extends com.trolltech.qt.gui.QAbstractButton
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: state)&gt;:<p> This signal is emitted whenever the check box's state changes, i. . whenever the user checks or unchecks it. <p><tt>state</tt> contains the check box's new {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }.
*/

    public final Signal1<java.lang.Integer> stateChanged = new Signal1<java.lang.Integer>();

    private final void stateChanged(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_int(nativeId(), arg__1);
    }
    native void __qt_stateChanged_int(long __this__nativeId, int arg__1);


/**
Constructs a checkbox with the given <tt>parent</tt>, but with no text. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QCheckBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a checkbox with the given <tt>parent</tt>, but with no text. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QCheckBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QCheckBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCheckBox_QWidget(long parent);


/**
Constructs a checkbox with the given <tt>parent</tt> and <tt>text</tt>. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QCheckBox(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a checkbox with the given <tt>parent</tt> and <tt>text</tt>. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QCheckBox(java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QCheckBox_String_QWidget(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCheckBox_String_QWidget(java.lang.String text, long parent);

/**
Returns the check box's check state. If you do not need tristate support, you can also use {@link QAbstractButton#isChecked() QAbstractButton::isChecked()} which returns a boolean. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCheckBox#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()}, and {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CheckState checkState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CheckState.resolve(__qt_checkState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_checkState(long __this__nativeId);

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
This property holds whether the checkbox is a tri-state checkbox. The default is false; i.e. the checkbox has only two states.
*/

    @com.trolltech.qt.QtPropertyReader(name="tristate")
    @QtBlockedSlot
    public final boolean isTristate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTristate(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTristate(long __this__nativeId);

/**
Sets the check box's check state to <tt>state</tt>. If you do not need tristate support, you can also use {@link QAbstractButton#setChecked(boolean) QAbstractButton::setChecked()} which takes a boolean. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCheckBox#checkState() checkState()}, and {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCheckState(com.trolltech.qt.core.Qt.CheckState state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckState_CheckState(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setCheckState_CheckState(long __this__nativeId, int state);


/**
This property holds whether the checkbox is a tri-state checkbox. The default is false; i.e. the checkbox has only two states.
*/

    @QtBlockedSlot
    public final void setTristate() {
        setTristate((boolean)true);
    }
/**
This property holds whether the checkbox is a tri-state checkbox. The default is false; i.e. the checkbox has only two states.
*/

    @com.trolltech.qt.QtPropertyWriter(name="tristate")
    @QtBlockedSlot
    public final void setTristate(boolean y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTristate_boolean(nativeId(), y);
    }
    @QtBlockedSlot
    native void __qt_setTristate_boolean(long __this__nativeId, boolean y);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
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

    public static native QCheckBox fromNativePointer(QNativePointer nativePointer);

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

    protected QCheckBox(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QCheckBox. This method is
useful for subclasses when they need a QStyleOptionButton, but don't want to
fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionButton option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
