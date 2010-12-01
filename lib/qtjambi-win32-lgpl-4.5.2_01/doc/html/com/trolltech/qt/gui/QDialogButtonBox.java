package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDialogButtonBox class is a widget that presents buttons in a layout that is appropriate to the current widget style. Dialogs and message boxes typically present buttons in a layout that conforms to the interface guidelines for that platform. Invariably, different platforms have different layouts for their dialogs. QDialogButtonBox allows a developer to add buttons to it and will automatically use the appropriate layout for the user's desktop environment. <p>Most buttons for a dialog follow certain roles. Such roles include: <ul><li> Accepting or rejecting the dialog.</li><li> Asking for help.</li><li> Performing actions on the dialog itself (such as resetting fields or applying changes).</li></ul> There can also be alternate ways of dismissing the dialog which may cause destructive results. <p>Most dialogs have buttons that can almost be considered standard (e.g. <b>OK</b> and <b>Cancel</b> buttons). It is sometimes convenient to create these buttons in a standard way. <p>There are a couple ways of using QDialogButtonBox. One ways is to create the buttons (or button texts) yourself and add them to the button box, specifying their role.<br><br>The following code example is written in c++.<br> <pre class="snippet">
    findButton = new QPushButton(tr("&Find"));
    findButton-&gt;setDefault(true);

    moreButton = new QPushButton(tr("&More"));
    moreButton-&gt;setCheckable(true);

    moreButton-&gt;setAutoDefault(false);

    buttonBox = new QDialogButtonBox(Qt::Vertical);
    buttonBox-&gt;addButton(findButton, QDialogButtonBox::ActionRole);
    buttonBox-&gt;addButton(moreButton, QDialogButtonBox::ActionRole);
</pre> Alternatively, QDialogButtonBox provides several standard buttons (e.g. OK, Cancel, Save) that you can use. They exist as flags so you can OR them together in the constructor.<br><br>The following code example is written in c++.<br> <pre class="snippet">
    buttonBox = new QDialogButtonBox(QDialogButtonBox::Ok
 
                                     | QDialogButtonBox::Cancel);

    connect(buttonBox, SIGNAL(accepted()), this, SLOT(accept()));
    connect(buttonBox, SIGNAL(rejected()), this, SLOT(reject()));
</pre> You can mix and match normal buttons and standard buttons. <p>Currently the buttons are laid out in the following way if the button box is horizontal: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/buttonbox-gnomelayout-horizontal.png"></center><br></td><td> Button box laid out in horizontal {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout GnomeLayout }</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/buttonbox-kdelayout-horizontal.png"></center><br></td><td> Button box laid out in horizontal {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout KdeLayout }</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/buttonbox-maclayout-horizontal.png"></center><br></td><td> Button box laid out in horizontal {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout MacLayout }</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/buttonbox-winlayout-horizontal.png"></center><br></td><td> Button box laid out in horizontal {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout WinLayout }</td></tr></table> The buttons are laid out the following way if the button box is vertical: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/buttonbox-gnomelayout-vertical.png"></center><br></td><td> Button box laid out in vertical {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout GnomeLayout }</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/buttonbox-kdelayout-vertical.png"></center><br></td><td> Button box laid out in vertical {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout KdeLayout }</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/buttonbox-maclayout-vertical.png"></center><br></td><td> Button box laid out in vertical {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout MacLayout }</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/buttonbox-winlayout-vertical.png"></center><br></td><td> Button box laid out in vertical {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout WinLayout }</td></tr></table> Additionally, button boxes that contain only buttons with {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole ActionRole } or {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole HelpRole } can be considered modeless and have an alternate look on the mac: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/buttonbox-mac-modeless-horizontal.png"></center><br></td><td> modeless horizontal {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout MacLayout }</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/buttonbox-mac-modeless-vertical.png"></center><br></td><td> modeless vertical {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout MacLayout }</td></tr></table> When a button is clicked in the button box, the {@link com.trolltech.qt.gui.QDialogButtonBox#clicked clicked() } signal is emitted for the actual button is that is pressed. For convenience, if the button has an {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }, {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole RejectRole }, or {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole HelpRole }, the {@link com.trolltech.qt.gui.QDialogButtonBox#accepted accepted() }, {@link com.trolltech.qt.gui.QDialogButtonBox#rejected rejected() }, or {@link com.trolltech.qt.gui.QDialogButtonBox#helpRequested helpRequested() } signals are emitted respectively. <p>If you want a specific button to be default you need to call {@link QPushButton#setDefault(boolean) QPushButton::setDefault()} on it yourself. However, if there is no default button set and to preserve which button is the default button across platforms when using the {@link QPushButton#autoDefault() QPushButton::autoDefault} property, the first push button with the accept role is made the default button when the QDialogButtonBox is shown, <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox QMessageBox}, {@link com.trolltech.qt.gui.QPushButton QPushButton}, and {@link com.trolltech.qt.gui.QDialog QDialog}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDialogButtonBox extends com.trolltech.qt.gui.QWidget
{
    
/**
This enum describes the layout policy to be used when arranging the buttons contained in the button box. The button layout is specified by the {@link com.trolltech.qt.gui.QWidget#style() current style}.
*/
@QtBlockedEnum
    public enum ButtonLayout implements com.trolltech.qt.QtEnumerator {
/**
 Use a policy appropriate for applications on Windows.
*/

        WinLayout(0),
/**
 Use a policy appropriate for applications on Mac OS X.
*/

        MacLayout(1),
/**
 Use a policy appropriate for applications on KDE.
*/

        KdeLayout(2),
/**
 Use a policy appropriate for applications on GNOME.
*/

        GnomeLayout(3);

        ButtonLayout(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDialogButtonBox$ButtonLayout constant with the specified <tt>int</tt>.</brief>
*/

        public static ButtonLayout resolve(int value) {
            return (ButtonLayout) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WinLayout;
            case 1: return MacLayout;
            case 2: return KdeLayout;
            case 3: return GnomeLayout;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the roles that can be used to describe buttons in the button box. Combinations of these roles are as flags used to describe different aspects of their behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox.StandardButton StandardButton }. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ButtonRole implements com.trolltech.qt.QtEnumerator {
/**
 The button is invalid.
*/

        InvalidRole(-1),
/**
 Clicking the button causes the dialog to be accepted (e.g. OK).
*/

        AcceptRole(0),
/**
 Clicking the button causes the dialog to be rejected (e.g. Cancel).
*/

        RejectRole(1),
/**
 Clicking the button causes a destructive change (e.g. for Discarding Changes) and closes the dialog.
*/

        DestructiveRole(2),
/**
 Clicking the button causes changes to the elements within the dialog.
*/

        ActionRole(3),
/**
 The button can be clicked to request help.
*/

        HelpRole(4),
/**
 The button is a "Yes"-like button.
*/

        YesRole(5),
/**
 The button is a "No"-like button.
*/

        NoRole(6),
/**
 The button resets the dialog's fields to default values.
*/

        ResetRole(7),
/**
 The button applies current changes.
*/

        ApplyRole(8),
        NRoles(9);

        ButtonRole(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDialogButtonBox$ButtonRole constant with the specified <tt>int</tt>.</brief>
*/

        public static ButtonRole resolve(int value) {
            return (ButtonRole) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return InvalidRole;
            case 0: return AcceptRole;
            case 1: return RejectRole;
            case 2: return DestructiveRole;
            case 3: return ActionRole;
            case 4: return HelpRole;
            case 5: return YesRole;
            case 6: return NoRole;
            case 7: return ResetRole;
            case 8: return ApplyRole;
            case 9: return NRoles;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
These enums describe flags for standard buttons. Each button has a defined {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole ButtonRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole ButtonRole }, and {@link QDialogButtonBox#standardButtons() standardButtons}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StandardButton implements com.trolltech.qt.QtEnumerator {
/**
 An invalid button.
*/

/**
 A "No" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole NoRole }.
*/

        NoButton(0),
/**
 An "OK" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }.
*/

        Ok(1024),
/**
 A "Save" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }.
*/

        Save(2048),
/**
 A "Save All" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }.
*/

        SaveAll(4096),
/**
 A "Open" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }.
*/

        Open(8192),
/**
 A "Yes" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole YesRole }.
*/

        Yes(16384),
/**
 A "Yes to All" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole YesRole }.
*/

        YesToAll(32768),
        No(65536),
/**
 A "No to All" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole NoRole }.
*/

        NoToAll(131072),
/**
 An "Abort" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole RejectRole }.
*/

        Abort(262144),
/**
 A "Retry" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }.
*/

        Retry(524288),
/**
 An "Ignore" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole }.
*/

        Ignore(1048576),
/**
 A "Close" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole RejectRole }.
*/

        Close(2097152),
/**
 A "Cancel" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole RejectRole }.
*/

        Cancel(4194304),
/**
 A "Discard" or "Don't Save" button, depending on the platform, defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole DestructiveRole }.
*/

        Discard(8388608),
/**
 A "Help" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole HelpRole }.
*/

        Help(16777216),
/**
 An "Apply" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole ApplyRole }.
*/

        Apply(33554432),
/**
 A "Reset" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole ResetRole }.
*/

        Reset(67108864),
/**
 A "Restore Defaults" button defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole ResetRole }.
*/

        RestoreDefaults(134217728),
;

        StandardButton(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QDialogButtonBox$StandardButtons with the specified <tt>com.trolltech.qt.gui.QDialogButtonBox$StandardButton[]</tt> QDialogButtonBox$StandardButton values set.</brief>
*/

        public static StandardButtons createQFlags(StandardButton ... values) {
            return new StandardButtons(values);
        }
/**
<brief>Returns the QDialogButtonBox$StandardButton constant with the specified <tt>int</tt>.</brief>
*/

        public static StandardButton resolve(int value) {
            return (StandardButton) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoButton;
            case 1024: return Ok;
            case 2048: return Save;
            case 4096: return SaveAll;
            case 8192: return Open;
            case 16384: return Yes;
            case 32768: return YesToAll;
            case 65536: return No;
            case 131072: return NoToAll;
            case 262144: return Abort;
            case 524288: return Retry;
            case 1048576: return Ignore;
            case 2097152: return Close;
            case 4194304: return Cancel;
            case 8388608: return Discard;
            case 16777216: return Help;
            case 33554432: return Apply;
            case 67108864: return Reset;
            case 134217728: return RestoreDefaults;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class StandardButtons extends com.trolltech.qt.QFlags<StandardButton> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QDialogButtonBox-StandardButtons with the specified <tt>com.trolltech.qt.gui.QDialogButtonBox.StandardButton[]</tt>. flags set.</brief>
*/

        public StandardButtons(StandardButton ... args) { super(args); }
        public StandardButtons(int value) { setValue(value); }
    }


/**
 This signal is emitted when a button inside the button box is clicked, as long as it was defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole AcceptRole } or {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole YesRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#rejected rejected() }, {@link com.trolltech.qt.gui.QDialogButtonBox#clicked clicked() }, and {@link com.trolltech.qt.gui.QDialogButtonBox#helpRequested helpRequested() }. <br></DD></DT>
*/

    public final Signal0 accepted = new Signal0();

    private final void accepted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accepted(nativeId());
    }
    native void __qt_accepted(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAbstractButton(named: button)&gt;:<p> This signal is emitted when a button inside the button box is clicked. The specific button that was pressed is specified by <tt>button</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#accepted accepted() }, {@link com.trolltech.qt.gui.QDialogButtonBox#rejected rejected() }, and {@link com.trolltech.qt.gui.QDialogButtonBox#helpRequested helpRequested() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAbstractButton> clicked = new Signal1<com.trolltech.qt.gui.QAbstractButton>();

    private final void clicked(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clicked_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    native void __qt_clicked_QAbstractButton(long __this__nativeId, long button);
/**
 This signal is emitted when a button inside the button box is clicked, as long as it was defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole HelpRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#accepted accepted() }, {@link com.trolltech.qt.gui.QDialogButtonBox#rejected rejected() }, and {@link com.trolltech.qt.gui.QDialogButtonBox#clicked clicked() }. <br></DD></DT>
*/

    public final Signal0 helpRequested = new Signal0();

    private final void helpRequested()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_helpRequested(nativeId());
    }
    native void __qt_helpRequested(long __this__nativeId);
/**
 This signal is emitted when a button inside the button box is clicked, as long as it was defined with the {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole RejectRole } or {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole NoRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#accepted accepted() }, {@link com.trolltech.qt.gui.QDialogButtonBox#helpRequested helpRequested() }, and {@link com.trolltech.qt.gui.QDialogButtonBox#clicked clicked() }. <br></DD></DT>
*/

    public final Signal0 rejected = new Signal0();

    private final void rejected()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rejected(nativeId());
    }
    native void __qt_rejected(long __this__nativeId);


/**
Constructs a button box with the given <tt>orientation</tt> and <tt>parent</tt>, containing the standard buttons specified by <tt>buttons</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox(com.trolltech.qt.gui.QDialogButtonBox.StandardButtons buttons, com.trolltech.qt.core.Qt.Orientation orientation) {
        this(buttons, orientation, (com.trolltech.qt.gui.QWidget)null);
    }

/**
Constructs a button box with the given <tt>orientation</tt> and <tt>parent</tt>, containing the standard buttons specified by <tt>buttons</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox(com.trolltech.qt.gui.QDialogButtonBox.StandardButtons buttons) {
        this(buttons, com.trolltech.qt.core.Qt.Orientation.Horizontal, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a button box with the given <tt>orientation</tt> and <tt>parent</tt>, containing the standard buttons specified by <tt>buttons</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox(com.trolltech.qt.gui.QDialogButtonBox.StandardButtons buttons, com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDialogButtonBox_StandardButtons_Orientation_QWidget(buttons.value(), orientation.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDialogButtonBox_StandardButtons_Orientation_QWidget(int buttons, int orientation, long parent);


/**
Constructs an empty, horizontal button box with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty, horizontal button box with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDialogButtonBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDialogButtonBox_QWidget(long parent);


/**
Constructs an empty button box with the given <tt>orientation</tt> and <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox(com.trolltech.qt.core.Qt.Orientation orientation) {
        this(orientation, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty button box with the given <tt>orientation</tt> and <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link QDialogButtonBox#orientation() orientation}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    public QDialogButtonBox(com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDialogButtonBox_Orientation_QWidget(orientation.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDialogButtonBox_Orientation_QWidget(int orientation, long parent);

/**
Adds the given <tt>button</tt> to the button box with the specified <tt>role</tt>. If the role is invalid, the button is not added. <p>If the button has already been added, it is removed and added again with the new role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#clear() clear()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addButton(com.trolltech.qt.gui.QAbstractButton button, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addButton_QAbstractButton_ButtonRole(nativeId(), button == null ? 0 : button.nativeId(), role.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addButton_QAbstractButton_ButtonRole(long __this__nativeId, long button, int role);

/**
Adds a standard <tt>button</tt> to the button box if it is valid to do so, and returns a push button. If <tt>button</tt> is invalid, it is not added to the button box, and zero is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPushButton addButton(com.trolltech.qt.gui.QDialogButtonBox.StandardButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addButton_StandardButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPushButton __qt_addButton_StandardButton(long __this__nativeId, int button);

/**
Creates a push button with the given <tt>text</tt>, adds it to the button box for the specified <tt>role</tt>, and returns the corresponding push button. If <tt>role</tt> is invalid, no button is created, and zero is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPushButton addButton(java.lang.String text, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addButton_String_ButtonRole(nativeId(), text, role.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPushButton __qt_addButton_String_ButtonRole(long __this__nativeId, java.lang.String text, int role);

/**
Returns the {@link com.trolltech.qt.gui.QPushButton QPushButton} corresponding to the standard button <tt>which</tt>, or 0 if the standard button doesn't exist in this button box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#standardButton(com.trolltech.qt.gui.QAbstractButton) standardButton()}, {@link com.trolltech.qt.gui.QDialogButtonBox#standardButtons() standardButtons()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#buttons() buttons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPushButton button(com.trolltech.qt.gui.QDialogButtonBox.StandardButton which)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_button_StandardButton(nativeId(), which.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPushButton __qt_button_StandardButton(long __this__nativeId, int which);

/**
Returns the button role for the specified <tt>button</tt>. This function returns {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonRole InvalidRole } if <tt>button</tt> is 0 or has not been added to the button box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#buttons() buttons()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDialogButtonBox.ButtonRole buttonRole(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QDialogButtonBox.ButtonRole.resolve(__qt_buttonRole_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_buttonRole_QAbstractButton(long __this__nativeId, long button);

/**
Returns a list of all the buttons that have been added to the button box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#buttonRole(com.trolltech.qt.gui.QAbstractButton) buttonRole()}, {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}. <br></DD></DT>
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
This property holds whether the buttons in the button box are centered. By default, this property is false. This behavior is appopriate for most types of dialogs. A notable exception is message boxes on most platforms (e.g. Windows), where the button box is centered horizontally. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox QMessageBox}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="centerButtons")
    @QtBlockedSlot
    public final boolean centerButtons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_centerButtons(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_centerButtons(long __this__nativeId);

/**
Clears the button box, deleting all buttons within it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
This property holds the orientation of the button box. By default, the orientation is horizontal (i.e. the buttons are laid out side by side). The possible orientations are {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } and {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }.
*/

    @com.trolltech.qt.QtPropertyReader(name="orientation")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Removes <tt>button</tt> from the button box without deleting it and sets its parent to zero. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#clear() clear()}, {@link com.trolltech.qt.gui.QDialogButtonBox#buttons() buttons()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeButton(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeButton_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeButton_QAbstractButton(long __this__nativeId, long button);

/**
This property holds whether the buttons in the button box are centered. By default, this property is false. This behavior is appopriate for most types of dialogs. A notable exception is message boxes on most platforms (e.g. Windows), where the button box is centered horizontally. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox QMessageBox}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="centerButtons")
    @QtBlockedSlot
    public final void setCenterButtons(boolean center)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCenterButtons_boolean(nativeId(), center);
    }
    @QtBlockedSlot
    native void __qt_setCenterButtons_boolean(long __this__nativeId, boolean center);

/**
This property holds the orientation of the button box. By default, the orientation is horizontal (i.e. the buttons are laid out side by side). The possible orientations are {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } and {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setStandardButtons(com.trolltech.qt.gui.QDialogButtonBox.StandardButton ... buttons) {
        this.setStandardButtons(new com.trolltech.qt.gui.QDialogButtonBox.StandardButtons(buttons));
    }
/**
This property holds collection of standard buttons in the button box. This property controls which standard buttons are used by the button box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="standardButtons")
    @QtBlockedSlot
    public final void setStandardButtons(com.trolltech.qt.gui.QDialogButtonBox.StandardButtons buttons)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStandardButtons_StandardButtons(nativeId(), buttons.value());
    }
    @QtBlockedSlot
    native void __qt_setStandardButtons_StandardButtons(long __this__nativeId, int buttons);

/**
Returns the standard button enum value corresponding to the given <tt>button</tt>, or {@link com.trolltech.qt.gui.QDialogButtonBox.StandardButton NoButton } if the given <tt>button</tt> isn't a standard button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#button(com.trolltech.qt.gui.QDialogButtonBox.StandardButton) button()}, {@link com.trolltech.qt.gui.QDialogButtonBox#buttons() buttons()}, and {@link com.trolltech.qt.gui.QDialogButtonBox#standardButtons() standardButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDialogButtonBox.StandardButton standardButton(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QDialogButtonBox.StandardButton.resolve(__qt_standardButton_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_standardButton_QAbstractButton(long __this__nativeId, long button);

/**
This property holds collection of standard buttons in the button box. This property controls which standard buttons are used by the button box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QDialogButtonBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="standardButtons")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDialogButtonBox.StandardButtons standardButtons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QDialogButtonBox.StandardButtons(__qt_standardButtons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_standardButtons(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QDialogButtonBox fromNativePointer(QNativePointer nativePointer);

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

    protected QDialogButtonBox(QPrivateConstructor p) { super(p); } 
}
