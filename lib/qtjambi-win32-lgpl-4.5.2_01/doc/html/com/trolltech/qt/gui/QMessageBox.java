package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMessageBox class provides a modal dialog for informing the user or for asking the user a question and receiving an answer. A message box displays a primary {@link QMessageBox#text() text} to alert the user to a situation, an {@link QMessageBox#informativeText() informative text} to further explain the alert or to ask the user a question, and an optional {@link QMessageBox#detailedText() detailed text} to provide even more data if the user requests it. A message box can also display an {@link QMessageBox#icon() icon} and {@link QMessageBox#standardButtons() standard buttons} for accepting a user response. <p>Two APIs for using QMessageBox are provided, the property-based API, and the static functions. Calling one of the static functions is the simpler approach, but it is less flexible than using the property-based API, and the result is less informative. Using the property-based API is recommended.<a name="the-property-based-api"><h2>The Property-based API</h2> To use the property-based API, construct an instance of QMessageBox, set the desired properties, and call exec() to show the message. The simplest configuration is to set only the {@link QMessageBox#text() message text} property.Error parsing snippet.</pre> The user must click the <b>OK</b> button to dismiss the message box. The rest of the GUI is blocked until the message box is dismissed. <br><center><img src="../images/msgbox1.png"></center><br> A better approach than just alerting the user to an event is to also ask the user what to do about it. Store the question in the {@link QMessageBox#informativeText() informative text} property, and set the {@link QMessageBox#standardButtons() standard buttons} property to the set of buttons you want as the set of user responses. The buttons are specified by combining values from StandardButtons using the bitwise OR operator. The display order for the buttons is platform-dependent. For example, on Windows, <b>Save</b> is displayed to the left of <b>Cancel</b>, whereas on Mac OS, the order is reversed. <p>Mark one of your standard buttons to be your {@link com.trolltech.qt.gui.QMessageBox#defaultButton() default button}.Error parsing snippet.</pre> This is the approach recommended in the Mac OS X Guidlines. Similar guidlines apply for the other platforms, but note the different ways the {@link QMessageBox#informativeText() informative text} is handled for different platforms. <br><center><img src="../images/msgbox2.png"></center><br> The exec() slot returns the StandardButtons value of the button that was clicked.Error parsing snippet.</pre> To give the user more information to help him answer the question, set the {@link QMessageBox#detailedText() detailed text} property. If the {@link QMessageBox#detailedText() detailed text} property is set, the <b>Show Details...</b> button will be shown. <br><center><img src="../images/msgbox3.png"></center><br> Clicking the <b>Show Details...</b> button displays the detailed text. <br><center><img src="../images/msgbox4.png"></center><br><a name="rich-text-and-the-text-format-property"><h3>Rich Text and the Text Format Property</h3> The {@link QMessageBox#detailedText() detailed text} property is always interpreted as plain text. The {@link QMessageBox#text() main text} and {@link QMessageBox#informativeText() informative text} properties can be either plain text or rich text. These strings are interpreted according to the setting of the {@link QMessageBox#textFormat() text format} property. The default setting is {@link com.trolltech.qt.core.Qt.TextFormat auto-text }. <p>Note that for some plain text strings containing XML meta-characters, the auto-text rich text detection test may fail causing your plain text string to be interpreted incorrectly as rich text. In these rare cases, use Qt::convertFromPlainText() to convert your plain text string to a visually equivalent rich text string, or set the {@link QMessageBox#textFormat() text format} property explicitly with {@link com.trolltech.qt.gui.QMessageBox#setTextFormat(com.trolltech.qt.core.Qt.TextFormat) setTextFormat()}.<a name="severity-levels-and-the-icon-and-pixmap-properties"><h3>Severity Levels and the Icon and Pixmap Properties</h3> QMessageBox supports four predefined message severity levels, or message types, which really only differ in the predefined icon they each show. Specify one of the four predefined message types by setting the {@link QMessageBox#icon() icon} property to one of the {@link com.trolltech.qt.gui.QMessageBox.Icon predefined Icons }. The following rules are guidelines: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qmessagebox-quest.png"></center><br></td><td> {@link com.trolltech.qt.gui.QMessageBox.Icon Question }</td><td> For asking a question during normal operations.</td></tr><tr valign="top" class="odd"><td> <br><center><img src="../images/qmessagebox-info.png"></center><br></td><td> {@link com.trolltech.qt.gui.QMessageBox.Icon Information }</td><td> For reporting information about normal operations.</td></tr><tr valign="top" class="even"><td> <br><center><img src="../images/qmessagebox-warn.png"></center><br></td><td> {@link com.trolltech.qt.gui.QMessageBox.Icon Warning }</td><td> For reporting non-critical errors.</td></tr><tr valign="top" class="odd"><td> <br><center><img src="../images/qmessagebox-crit.png"></center><br></td><td> {@link com.trolltech.qt.gui.QMessageBox.Icon Critical }</td><td> For reporting critical errors.</td></tr></table> The default value is {@link com.trolltech.qt.gui.QMessageBox.Icon No Icon }. The message boxes are otherwise the same for all cases. When using a standard icon, use the one recommended in the table, or use the one recommended by the style guidelines for your platform. If none of the standard icons is right for your message box, you can use a custom icon by setting the {@link QMessageBox#iconPixmap() icon pixmap} property instead of setting the {@link QMessageBox#icon() icon} property. <p>In summary, to set an icon, use either{@link com.trolltech.qt.gui.QMessageBox#setIcon(com.trolltech.qt.gui.QMessageBox.Icon) setIcon()} for one of the standard icons, or{@link com.trolltech.qt.gui.QMessageBox#setIconPixmap(com.trolltech.qt.gui.QPixmap) setIconPixmap()} for a custom icon.<a name="the-static-functions-api"><h2>The Static Functions API</h2> Building message boxes with the static functions API, although convenient, is less flexible than using the property-based API, because the static function signatures lack parameters for setting the {@link QMessageBox#informativeText() informative text} and {@link QMessageBox#detailedText() detailed text} properties. One work-around for this has been to use the <tt>title</tt> parameter as the message box main text and the <tt>text</tt> parameter as the message box informative text. Because this has the obvious drawback of making a less readable message box, platform guidelines do not recommend it. The Microsoft Windows User Interface Guidelines recommend using the {@link QCoreApplication#applicationName() application name} as the window's title, which means that if you have an informative text in addition to your main text, you must concatenate it to the <tt>text</tt> parameter. <p>Note that the static function signatures have changed with respect to their button parameters, which are now used to set the {@link QMessageBox#standardButtons() standard buttons} and the {@link com.trolltech.qt.gui.QMessageBox#defaultButton() default button}. <p>Static functions are available for creating {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, {@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()} message boxes. <pre class="snippet">
        QMessageBox.StandardButtons buttons = new QMessageBox.StandardButtons();
        buttons.set(QMessageBox.StandardButton.Save);
        buttons.set(QMessageBox.StandardButton.Discard);
        buttons.set(QMessageBox.StandardButton.Cancel);
        QMessageBox.StandardButton ret = QMessageBox.warning(this, tr("My Application"),
                          tr("The document has been modified.\n"
                             + "Do you want to save your changes?"),
                             buttons, QMessageBox.StandardButton.Save);
</pre> The {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs</a>} example shows how to use QMessageBox and the other built-in Qt dialogs.<a name="advanced-usage"><h2>Advanced Usage</h2> If the standard buttons are not flexible enough for your message box, you can use the {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()} overload that takes a text and a ButtonRoleto to add custom buttons. The {@link com.trolltech.qt.gui.QMessageBox.ButtonRole ButtonRole } is used by QMessageBox to determine the ordering of the buttons on screen (which varies according to the platform). You can test the value of {@link com.trolltech.qt.gui.QMessageBox#clickedButton() clickedButton()} after calling exec(). For example, <pre class="snippet">
        QMessageBox msgBox = new QMessageBox();
        QPushButton connectButton = msgBox.addButton(tr("Connect"), QMessageBox.ButtonRole.ActionRole);
        QPushButton abortButton = msgBox.addButton(QMessageBox.StandardButton.Abort);

        msgBox.exec();

        if (msgBox.clickedButton() == connectButton) {
            // connect
        } else if (msgBox.clickedButton() == abortButton) {
            // abort
        }
</pre><a name="default-and-escape-keys"><h2>Default and Escape Keys</h2> The default button (i.e., the button activated when <b>Enter</b> is pressed) can be specified using {@link com.trolltech.qt.gui.QMessageBox#setDefaultButton(com.trolltech.qt.gui.QMessageBox.StandardButton) setDefaultButton()}. If a default button is not specified, QMessageBox tries to find one based on the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole button roles } of the buttons used in the message box. <p>The escape button (the button activated when <b>Esc</b> is pressed) can be specified using {@link com.trolltech.qt.gui.QMessageBox#setEscapeButton(com.trolltech.qt.gui.QAbstractButton) setEscapeButton()}. If an escape button is not specified, QMessageBox tries to find one using these rules: <ol><li> If there is only one button, it is the button activated when <b>Esc</b> is pressed.</li><li> If there is a {@link com.trolltech.qt.gui.QMessageBox.StandardButton Cancel } button, it is the button activated when <b>Esc</b> is pressed.</li><li> If there is exactly one button having either {@link com.trolltech.qt.gui.QMessageBox.ButtonRole the Reject role } or the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole the No role }, it is the button activated when <b>Esc</b> is pressed.</li></ol> When an escape button can't be determined using these rules, pressing <b>Esc</b> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}, {@link <a href="../guibooks.html">GUI Design Handbook: Message Box</a>}, {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMessageBox extends com.trolltech.qt.gui.QDialog
{
    
/**
This enum describes the roles that can be used to describe buttons in the button box. Combinations of these roles are as flags used to describe different aspects of their behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox.StandardButton StandardButton }. <br></DD></DT>
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
<brief>Returns the QMessageBox$ButtonRole constant with the specified <tt>int</tt>.</brief>
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
These enums describe flags for standard buttons. Each button has a defined {@link com.trolltech.qt.gui.QMessageBox.ButtonRole ButtonRole }. The following values are obsolete: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox.ButtonRole ButtonRole }, and {@link QMessageBox#standardButtons() standardButtons}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StandardButton implements com.trolltech.qt.QtEnumerator {
/**
 An invalid button.
*/

/**
 A "No" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole NoRole }.
*/

        NoButton(0),
/**
 An "OK" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole AcceptRole }.
*/

        Ok(1024),
/**
 A "Save" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole AcceptRole }.
*/

        Save(2048),
/**
 A "Save All" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole AcceptRole }.
*/

        SaveAll(4096),
/**
 A "Open" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole AcceptRole }.
*/

        Open(8192),
/**
 A "Yes" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole YesRole }.
*/

        Yes(16384),
/**
 A "Yes to All" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole YesRole }.
*/

        YesToAll(32768),
        No(65536),
/**
 A "No to All" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole NoRole }.
*/

        NoToAll(131072),
/**
 An "Abort" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole RejectRole }.
*/

        Abort(262144),
/**
 A "Retry" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole AcceptRole }.
*/

        Retry(524288),
/**
 An "Ignore" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole AcceptRole }.
*/

        Ignore(1048576),
/**
 A "Close" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole RejectRole }.
*/

        Close(2097152),
/**
 A "Cancel" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole RejectRole }.
*/

        Cancel(4194304),
/**
 A "Discard" or "Don't Save" button, depending on the platform, defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole DestructiveRole }.
*/

        Discard(8388608),
/**
 A "Help" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole HelpRole }.
*/

        Help(16777216),
/**
 An "Apply" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole ApplyRole }.
*/

        Apply(33554432),
/**
 A "Reset" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole ResetRole }.
*/

        Reset(67108864),
/**
 A "Restore Defaults" button defined with the {@link com.trolltech.qt.gui.QMessageBox.ButtonRole ResetRole }.
*/

        RestoreDefaults(134217728),
/**
 Use the <tt>defaultButton</tt> argument of {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, etc. instead, or call {@link com.trolltech.qt.gui.QMessageBox#setDefaultButton(com.trolltech.qt.gui.QMessageBox.StandardButton) setDefaultButton()}.
*/

        Default(256),
/**
 Call {@link com.trolltech.qt.gui.QMessageBox#setEscapeButton(com.trolltech.qt.gui.QAbstractButton) setEscapeButton()} instead.
*/

        Escape(512),
/**

*/

        FlagMask(768),
/**

*/

        ButtonMask(769);

        StandardButton(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QMessageBox$StandardButtons with the specified <tt>com.trolltech.qt.gui.QMessageBox$StandardButton[]</tt> QMessageBox$StandardButton values set.</brief>
*/

        public static StandardButtons createQFlags(StandardButton ... values) {
            return new StandardButtons(values);
        }
/**
<brief>Returns the QMessageBox$StandardButton constant with the specified <tt>int</tt>.</brief>
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
            case 256: return Default;
            case 512: return Escape;
            case 768: return FlagMask;
            case 769: return ButtonMask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class StandardButtons extends com.trolltech.qt.QFlags<StandardButton> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QMessageBox-StandardButtons with the specified <tt>com.trolltech.qt.gui.QMessageBox.StandardButton[]</tt>. flags set.</brief>
*/

        public StandardButtons(StandardButton ... args) { super(args); }
        public StandardButtons(int value) { setValue(value); }
    }
/**
This enum has the following values.
*/


    public enum Icon implements com.trolltech.qt.QtEnumerator {
/**
 the message box does not have any icon.
*/

        NoIcon(0),
/**
 an icon indicating that the message is nothing out of the ordinary.
*/

        Information(1),
/**
 an icon indicating that the message is a warning, but can be dealt with.
*/

        Warning(2),
/**
 an icon indicating that the message represents a critical problem.
*/

        Critical(3),
/**
 an icon indicating that the message is asking a question.
*/

        Question(4);

        Icon(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QMessageBox$Icon constant with the specified <tt>int</tt>.</brief>
*/

        public static Icon resolve(int value) {
            return (Icon) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoIcon;
            case 1: return Information;
            case 2: return Warning;
            case 3: return Critical;
            case 4: return Question;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAbstractButton(named: button)&gt;:<p> This signal is emitted whenever a button is clicked inside the QMessageBox. The button that was clicked in returned in <tt>button</tt>.
*/

    public final Signal1<com.trolltech.qt.gui.QAbstractButton> buttonClicked = new Signal1<com.trolltech.qt.gui.QAbstractButton>();

    private final void buttonClicked(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_buttonClicked_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    native void __qt_buttonClicked_QAbstractButton(long __this__nativeId, long button);


/**
This is an overloaded method provided for convenience.
*/

    public QMessageBox(com.trolltech.qt.gui.QMessageBox.Icon icon, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(icon, title, text, buttons, parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a message box with the given <tt>icon</tt>, <tt>title</tt>, <tt>text</tt>, and standard <tt>buttons</tt>. Standard or custom buttons can be added at any time using {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p>On Mac OS X, if <tt>parent</tt> is not 0 and you want your message box to appear as a {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } of that parent, set the message box's window modality to {@link com.trolltech.qt.core.Qt.WindowModality Qt::WindowModal } (default). Otherwise, the message box will be a standard dialog. <p><DT><b>See also:</b><br><DD>setWindowTitle(), {@link com.trolltech.qt.gui.QMessageBox#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QMessageBox#setIcon(com.trolltech.qt.gui.QMessageBox.Icon) setIcon()}, and {@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
*/

    public QMessageBox(com.trolltech.qt.gui.QMessageBox.Icon icon, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QWidget parent) {
        this(icon, title, text, buttons, parent, new com.trolltech.qt.core.Qt.WindowFlags(259));
    }

/**
Constructs a message box with the given <tt>icon</tt>, <tt>title</tt>, <tt>text</tt>, and standard <tt>buttons</tt>. Standard or custom buttons can be added at any time using {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p>On Mac OS X, if <tt>parent</tt> is not 0 and you want your message box to appear as a {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } of that parent, set the message box's window modality to {@link com.trolltech.qt.core.Qt.WindowModality Qt::WindowModal } (default). Otherwise, the message box will be a standard dialog. <p><DT><b>See also:</b><br><DD>setWindowTitle(), {@link com.trolltech.qt.gui.QMessageBox#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QMessageBox#setIcon(com.trolltech.qt.gui.QMessageBox.Icon) setIcon()}, and {@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
*/

    public QMessageBox(com.trolltech.qt.gui.QMessageBox.Icon icon, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons) {
        this(icon, title, text, buttons, (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(259));
    }

/**
Constructs a message box with the given <tt>icon</tt>, <tt>title</tt>, <tt>text</tt>, and standard <tt>buttons</tt>. Standard or custom buttons can be added at any time using {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p>On Mac OS X, if <tt>parent</tt> is not 0 and you want your message box to appear as a {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } of that parent, set the message box's window modality to {@link com.trolltech.qt.core.Qt.WindowModality Qt::WindowModal } (default). Otherwise, the message box will be a standard dialog. <p><DT><b>See also:</b><br><DD>setWindowTitle(), {@link com.trolltech.qt.gui.QMessageBox#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QMessageBox#setIcon(com.trolltech.qt.gui.QMessageBox.Icon) setIcon()}, and {@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
*/

    public QMessageBox(com.trolltech.qt.gui.QMessageBox.Icon icon, java.lang.String title, java.lang.String text) {
        this(icon, title, text, new com.trolltech.qt.gui.QMessageBox.StandardButtons(0), (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(259));
    }
/**
Constructs a message box with the given <tt>icon</tt>, <tt>title</tt>, <tt>text</tt>, and standard <tt>buttons</tt>. Standard or custom buttons can be added at any time using {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p>On Mac OS X, if <tt>parent</tt> is not 0 and you want your message box to appear as a {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } of that parent, set the message box's window modality to {@link com.trolltech.qt.core.Qt.WindowModality Qt::WindowModal } (default). Otherwise, the message box will be a standard dialog. <p><DT><b>See also:</b><br><DD>setWindowTitle(), {@link com.trolltech.qt.gui.QMessageBox#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QMessageBox#setIcon(com.trolltech.qt.gui.QMessageBox.Icon) setIcon()}, and {@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
*/

    public QMessageBox(com.trolltech.qt.gui.QMessageBox.Icon icon, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QMessageBox_Icon_String_String_StandardButtons_QWidget_WindowFlags(icon.value(), title, text, buttons.value(), parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QMessageBox_Icon_String_String_StandardButtons_QWidget_WindowFlags(int icon, java.lang.String title, java.lang.String text, int buttons, long parent, int flags);


/**
Constructs a message box with no text and no buttons. <tt>parent</tt> is passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p>On Mac OS X, if <tt>parent</tt> is not 0 and you want your message box to appear as a {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } of that parent, set the message box's window modality to {@link com.trolltech.qt.core.Qt.WindowModality Qt::WindowModal } (default). Otherwise, the message box will be a standard dialog.
*/

    public QMessageBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a message box with no text and no buttons. <tt>parent</tt> is passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p>On Mac OS X, if <tt>parent</tt> is not 0 and you want your message box to appear as a {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } of that parent, set the message box's window modality to {@link com.trolltech.qt.core.Qt.WindowModality Qt::WindowModal } (default). Otherwise, the message box will be a standard dialog.
*/

    public QMessageBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QMessageBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMessageBox_QWidget(long parent);

/**
Adds the given <tt>button</tt> to the message box with the specified <tt>role</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}, {@link com.trolltech.qt.gui.QMessageBox#button(com.trolltech.qt.gui.QMessageBox.StandardButton) button()}, and {@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addButton(com.trolltech.qt.gui.QAbstractButton button, com.trolltech.qt.gui.QMessageBox.ButtonRole role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addButton_QAbstractButton_ButtonRole(nativeId(), button == null ? 0 : button.nativeId(), role.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addButton_QAbstractButton_ButtonRole(long __this__nativeId, long button, int role);

/**
This is an overloaded member function, provided for convenience. <p>Adds a standard <tt>button</tt> to the message box if it is valid to do so, and returns the push button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPushButton addButton(com.trolltech.qt.gui.QMessageBox.StandardButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addButton_StandardButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPushButton __qt_addButton_StandardButton(long __this__nativeId, int button);

/**
This is an overloaded member function, provided for convenience. <p>Creates a button with the given <tt>text</tt>, adds it to the message box for the specified <tt>role</tt>, and returns it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPushButton addButton(java.lang.String text, com.trolltech.qt.gui.QMessageBox.ButtonRole role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addButton_String_ButtonRole(nativeId(), text, role.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPushButton __qt_addButton_String_ButtonRole(long __this__nativeId, java.lang.String text, int role);

/**
Returns a pointer corresponding to the standard button <tt>which</tt>, or 0 if the standard button doesn't exist in this message box. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#standardButtons() standardButtons}, and {@link com.trolltech.qt.gui.QMessageBox#standardButton(com.trolltech.qt.gui.QAbstractButton) standardButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractButton button(com.trolltech.qt.gui.QMessageBox.StandardButton which)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_button_StandardButton(nativeId(), which.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractButton __qt_button_StandardButton(long __this__nativeId, int which);

/**
Returns the button role for the specified <tt>button</tt>. This function returns {@link com.trolltech.qt.gui.QMessageBox.ButtonRole InvalidRole } if <tt>button</tt> is 0 or has not been added to the message box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#buttons() buttons()}, and {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMessageBox.ButtonRole buttonRole(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMessageBox.ButtonRole.resolve(__qt_buttonRole_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_buttonRole_QAbstractButton(long __this__nativeId, long button);

/**
Returns a list of all the buttons that have been added to the message box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#buttonRole(com.trolltech.qt.gui.QAbstractButton) buttonRole()}, {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link com.trolltech.qt.gui.QMessageBox#removeButton(com.trolltech.qt.gui.QAbstractButton) removeButton()}. <br></DD></DT>
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
Returns the button that was clicked by the user, or 0 if the user hit the <b>Esc</b> key and no {@link com.trolltech.qt.gui.QMessageBox#setEscapeButton(com.trolltech.qt.gui.QAbstractButton) escape button} was set. <p>If exec() hasn't been called yet, returns 0. <p>Example: <pre class="snippet">
        QMessageBox messageBox = new QMessageBox(this);
        QAbstractButton disconnectButton =
              messageBox.addButton(tr("Disconnect"), QMessageBox.ButtonRole.ActionRole);
        // ...
        messageBox.exec();
        if (messageBox.clickedButton() == disconnectButton) {
           // ...
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#standardButton(com.trolltech.qt.gui.QAbstractButton) standardButton()}, and {@link com.trolltech.qt.gui.QMessageBox#button(com.trolltech.qt.gui.QMessageBox.StandardButton) button()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractButton clickedButton()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clickedButton(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractButton __qt_clickedButton(long __this__nativeId);

/**
Returns the button that should be the message box's {@link QPushButton#setDefault(boolean) default button}. Returns 0 if no default button was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#setDefaultButton(com.trolltech.qt.gui.QMessageBox.StandardButton) setDefaultButton()}, {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link QPushButton#setDefault(boolean) QPushButton::setDefault()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPushButton defaultButton()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultButton(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPushButton __qt_defaultButton(long __this__nativeId);

/**
This property holds the text to be displayed in the details area.  The text will be interpreted as a plain text. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#text() QMessageBox::text}, and {@link QMessageBox#informativeText() QMessageBox::informativeText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="detailedText")
    @QtBlockedSlot
    public final java.lang.String detailedText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_detailedText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_detailedText(long __this__nativeId);

/**
Returns the button that is activated when escape is pressed. <p>By default, QMessageBox attempts to automatically detect an escape button as follows: <ol><li> If there is only one button, it is made the escape button.</li><li> If there is a {@link com.trolltech.qt.gui.QMessageBox.StandardButton Cancel } button, it is made the escape button.</li><li> On Mac OS X only, if there is exactly one button with the role {@link com.trolltech.qt.gui.QMessageBox.ButtonRole QMessageBox::RejectRole }, it is made the escape button.</li></ol> When an escape button could not be automatically detected, pressing <b>Esc</b> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#setEscapeButton(com.trolltech.qt.gui.QAbstractButton) setEscapeButton()}, and {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractButton escapeButton()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_escapeButton(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractButton __qt_escapeButton(long __this__nativeId);

/**
This property holds the message box's icon. The icon of the message box can be specified with one of the values: <ul><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::NoIcon }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Question }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Information }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Warning }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Critical }</li></ul> The default is {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::NoIcon }. <p>The pixmap used to display the actual icon depends on the current {@link com.trolltech.qt.gui.QWidget#style() GUI style}. You can also set a custom pixmap for the icon by setting the {@link QMessageBox#iconPixmap() icon pixmap} property. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#iconPixmap() iconPixmap}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="icon")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMessageBox.Icon icon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMessageBox.Icon.resolve(__qt_icon(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_icon(long __this__nativeId);

/**
This property holds the current icon. The icon currently used by the message box. Note that it's often hard to draw one pixmap that looks appropriate in all GUI styles; you may want to supply a different pixmap for each platform. <p>By default, this property is undefined. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#icon() icon}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="iconPixmap")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap iconPixmap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconPixmap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_iconPixmap(long __this__nativeId);

/**
This property holds the informative text that provides a fuller description for the message. Infromative text can be used to expand upon the {@link com.trolltech.qt.gui.QMessageBox#text() text()} to give more information to the user. On the Mac, this text appears in small system font below the {@link com.trolltech.qt.gui.QMessageBox#text() text()}. On other platforms, it is simply appended to the existing text. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#text() QMessageBox::text}, and {@link QMessageBox#detailedText() QMessageBox::detailedText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="informativeText")
    @QtBlockedSlot
    public final java.lang.String informativeText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_informativeText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_informativeText(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void open()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_open(nativeId());
    }
    @QtBlockedSlot
    native void __qt_open(long __this__nativeId);

/**
Removes <tt>button</tt> from the button box without deleting it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link com.trolltech.qt.gui.QMessageBox#setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton[]) setStandardButtons()}. <br></DD></DT>
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
Sets the message box's {@link QPushButton#setDefault(boolean) default button} to <tt>button</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link QPushButton#setDefault(boolean) QPushButton::setDefault()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDefaultButton(com.trolltech.qt.gui.QMessageBox.StandardButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultButton_StandardButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native void __qt_setDefaultButton_StandardButton(long __this__nativeId, int button);

/**
Sets the message box's {@link QPushButton#setDefault(boolean) default button} to <tt>button</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#defaultButton() defaultButton()}, {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link QPushButton#setDefault(boolean) QPushButton::setDefault()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setDefaultButton(com.trolltech.qt.gui.QPushButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultButton_QPushButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setDefaultButton_QPushButton(long __this__nativeId, long button);

/**
This property holds the text to be displayed in the details area.  The text will be interpreted as a plain text. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#text() QMessageBox::text}, and {@link QMessageBox#informativeText() QMessageBox::informativeText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="detailedText")
    @QtBlockedSlot
    public final void setDetailedText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDetailedText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setDetailedText_String(long __this__nativeId, java.lang.String text);

/**
Sets the button that gets activated when the <b>Escape</b> key is pressed to <tt>button</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#escapeButton() escapeButton()}, {@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link com.trolltech.qt.gui.QMessageBox#clickedButton() clickedButton()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setEscapeButton(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEscapeButton_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setEscapeButton_QAbstractButton(long __this__nativeId, long button);

/**
Sets the buttons that gets activated when the <b>Escape</b> key is pressed to <tt>button</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}, and {@link com.trolltech.qt.gui.QMessageBox#clickedButton() clickedButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEscapeButton(com.trolltech.qt.gui.QMessageBox.StandardButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEscapeButton_StandardButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native void __qt_setEscapeButton_StandardButton(long __this__nativeId, int button);

/**
This property holds the message box's icon. The icon of the message box can be specified with one of the values: <ul><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::NoIcon }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Question }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Information }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Warning }</li><li> {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::Critical }</li></ul> The default is {@link com.trolltech.qt.gui.QMessageBox.Icon QMessageBox::NoIcon }. <p>The pixmap used to display the actual icon depends on the current {@link com.trolltech.qt.gui.QWidget#style() GUI style}. You can also set a custom pixmap for the icon by setting the {@link QMessageBox#iconPixmap() icon pixmap} property. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#iconPixmap() iconPixmap}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="icon")
    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QMessageBox.Icon arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_Icon(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setIcon_Icon(long __this__nativeId, int arg__1);

/**
This property holds the current icon. The icon currently used by the message box. Note that it's often hard to draw one pixmap that looks appropriate in all GUI styles; you may want to supply a different pixmap for each platform. <p>By default, this property is undefined. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#icon() icon}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconPixmap")
    @QtBlockedSlot
    public final void setIconPixmap(com.trolltech.qt.gui.QPixmap pixmap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconPixmap_QPixmap(nativeId(), pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconPixmap_QPixmap(long __this__nativeId, long pixmap);

/**
This property holds the informative text that provides a fuller description for the message. Infromative text can be used to expand upon the {@link com.trolltech.qt.gui.QMessageBox#text() text()} to give more information to the user. On the Mac, this text appears in small system font below the {@link com.trolltech.qt.gui.QMessageBox#text() text()}. On other platforms, it is simply appended to the existing text. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#text() QMessageBox::text}, and {@link QMessageBox#detailedText() QMessageBox::detailedText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="informativeText")
    @QtBlockedSlot
    public final void setInformativeText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInformativeText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setInformativeText_String(long __this__nativeId, java.lang.String text);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButton ... buttons) {
        this.setStandardButtons(new com.trolltech.qt.gui.QMessageBox.StandardButtons(buttons));
    }
/**
This property holds collection of standard buttons in the message box. This property controls which standard buttons are used by the message box. <p>By default, this property contains no standard buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="standardButtons")
    @QtBlockedSlot
    public final void setStandardButtons(com.trolltech.qt.gui.QMessageBox.StandardButtons buttons)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStandardButtons_StandardButtons(nativeId(), buttons.value());
    }
    @QtBlockedSlot
    native void __qt_setStandardButtons_StandardButtons(long __this__nativeId, int buttons);

/**
This property holds the message box text to be displayed.  The text will be interpreted either as a plain text or as rich text, depending on the text format setting ({@link QMessageBox#textFormat() QMessageBox::textFormat}). The default setting is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }, i.e., the message box will try to auto-detect the format of the text. <p>The default value of this property is an empty string. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#textFormat() textFormat}, {@link QMessageBox#informativeText() QMessageBox::informativeText}, and {@link QMessageBox#detailedText() QMessageBox::detailedText}. <br></DD></DT>
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
This property holds the format of the text displayed by the message box. The current text format used by the message box. See the {@link com.trolltech.qt.core.Qt.TextFormat Qt::TextFormat } enum for an explanation of the possible options. <p>The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#setText(java.lang.String) setText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="textFormat")
    @QtBlockedSlot
    public final void setTextFormat(com.trolltech.qt.core.Qt.TextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextFormat_TextFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native void __qt_setTextFormat_TextFormat(long __this__nativeId, int format);

/**
Returns the standard button enum value corresponding to the given <tt>button</tt>, or {@link com.trolltech.qt.gui.QMessageBox.StandardButton NoButton } if the given <tt>button</tt> isn't a standard button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#button(com.trolltech.qt.gui.QMessageBox.StandardButton) button()}, and {@link com.trolltech.qt.gui.QMessageBox#standardButtons() standardButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMessageBox.StandardButton standardButton(com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMessageBox.StandardButton.resolve(__qt_standardButton_QAbstractButton(nativeId(), button == null ? 0 : button.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_standardButton_QAbstractButton(long __this__nativeId, long button);

/**
This property holds collection of standard buttons in the message box. This property controls which standard buttons are used by the message box. <p>By default, this property contains no standard buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#addButton(com.trolltech.qt.gui.QAbstractButton, com.trolltech.qt.gui.QMessageBox.ButtonRole) addButton()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="standardButtons")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMessageBox.StandardButtons standardButtons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QMessageBox.StandardButtons(__qt_standardButtons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_standardButtons(long __this__nativeId);

/**
This property holds the message box text to be displayed.  The text will be interpreted either as a plain text or as rich text, depending on the text format setting ({@link QMessageBox#textFormat() QMessageBox::textFormat}). The default setting is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }, i.e., the message box will try to auto-detect the format of the text. <p>The default value of this property is an empty string. <p><DT><b>See also:</b><br><DD>{@link QMessageBox#textFormat() textFormat}, {@link QMessageBox#informativeText() QMessageBox::informativeText}, and {@link QMessageBox#detailedText() QMessageBox::detailedText}. <br></DD></DT>
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
This property holds the format of the text displayed by the message box. The current text format used by the message box. See the {@link com.trolltech.qt.core.Qt.TextFormat Qt::TextFormat } enum for an explanation of the possible options. <p>The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#setText(java.lang.String) setText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="textFormat")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextFormat textFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextFormat.resolve(__qt_textFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textFormat(long __this__nativeId);

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
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long event);

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
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long event);

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
Displays a simple about box with title <tt>title</tt> and text <tt>text</tt>. The about box's parent is <tt>parent</tt>. <p>{@link com.trolltech.qt.gui.QMessageBox#about(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String) about()} looks for a suitable icon in four locations: <ol><li> It prefers {@link QWidget#windowIcon() parent->icon()} if that exists.</li><li> If not, it tries the top-level widget containing <tt>parent</tt>.</li><li> If that fails, it tries the {@link com.trolltech.qt.gui.QApplication#activeWindow() active window.}</li><li> As a last resort it uses the Information icon.</li></ol> The about box has a single button labelled "OK". On Mac OS X, the about box is popped up as a modeless window; on other platforms, it is currently a window modal. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIcon() QWidget::windowIcon()}, and {@link com.trolltech.qt.gui.QApplication#activeWindow() QApplication::activeWindow()}. <br></DD></DT>
*/

    public static void about(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text)    {
        __qt_about_QWidget_String_String(parent == null ? 0 : parent.nativeId(), title, text);
    }
    native static void __qt_about_QWidget_String_String(long parent, java.lang.String title, java.lang.String text);


/**
Displays a simple message box about Qt, with the given <tt>title</tt> and centered over <tt>parent</tt> (if <tt>parent</tt> is not 0). The message includes the version number of Qt being used by the application. <p>This is useful for inclusion in the <b>Help</b> menu of an application, as shown in the {@link <a href="../qtjambi-menus.html">Menus</a>} example. <p>{@link com.trolltech.qt.gui.QApplication QApplication} provides this functionality as a slot. <p>On Mac OS X, the about box is popped up as a modeless window; on other platforms, it is currently window modal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#aboutQt() QApplication::aboutQt()}. <br></DD></DT>
*/

    public static void aboutQt(com.trolltech.qt.gui.QWidget parent) {
        aboutQt(parent, (java.lang.String)null);
    }
/**
Displays a simple message box about Qt, with the given <tt>title</tt> and centered over <tt>parent</tt> (if <tt>parent</tt> is not 0). The message includes the version number of Qt being used by the application. <p>This is useful for inclusion in the <b>Help</b> menu of an application, as shown in the {@link <a href="../qtjambi-menus.html">Menus</a>} example. <p>{@link com.trolltech.qt.gui.QApplication QApplication} provides this functionality as a slot. <p>On Mac OS X, the about box is popped up as a modeless window; on other platforms, it is currently window modal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#aboutQt() QApplication::aboutQt()}. <br></DD></DT>
*/

    public static void aboutQt(com.trolltech.qt.gui.QWidget parent, java.lang.String title)    {
        __qt_aboutQt_QWidget_String(parent == null ? 0 : parent.nativeId(), title);
    }
    native static void __qt_aboutQt_QWidget_String(long parent, java.lang.String title);


/**
Opens a critical message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QMessageBox constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton critical(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons) {
        return critical(parent, title, text, buttons, com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }

/**
Opens a critical message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QMessageBox constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton critical(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text) {
        return critical(parent, title, text, new com.trolltech.qt.gui.QMessageBox.StandardButtons(1024), com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }
/**
Opens a critical message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QMessageBox constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton critical(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QMessageBox.StandardButton defaultButton)    {
        return com.trolltech.qt.gui.QMessageBox.StandardButton.resolve(__qt_critical_QWidget_String_String_StandardButtons_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, buttons.value(), defaultButton.value()));
    }
    native static int __qt_critical_QWidget_String_String_StandardButtons_StandardButton(long parent, java.lang.String title, java.lang.String text, int buttons, int defaultButton);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static int critical(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButton button0, com.trolltech.qt.gui.QMessageBox.StandardButton button1)    {
        return __qt_critical_QWidget_String_String_StandardButton_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, button0.value(), button1.value());
    }
    native static int __qt_critical_QWidget_String_String_StandardButton_StandardButton(long parent, java.lang.String title, java.lang.String text, int button0, int button1);


/**
Opens an information message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton information(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons) {
        return information(parent, title, text, buttons, com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }

/**
Opens an information message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton information(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text) {
        return information(parent, title, text, new com.trolltech.qt.gui.QMessageBox.StandardButtons(1024), com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }
/**
Opens an information message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton information(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QMessageBox.StandardButton defaultButton)    {
        return com.trolltech.qt.gui.QMessageBox.StandardButton.resolve(__qt_information_QWidget_String_String_StandardButtons_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, buttons.value(), defaultButton.value()));
    }
    native static int __qt_information_QWidget_String_String_StandardButtons_StandardButton(long parent, java.lang.String title, java.lang.String text, int buttons, int defaultButton);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton information(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButton button0) {
        return information(parent, title, text, button0, com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton information(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButton button0, com.trolltech.qt.gui.QMessageBox.StandardButton button1)    {
        return com.trolltech.qt.gui.QMessageBox.StandardButton.resolve(__qt_information_QWidget_String_String_StandardButton_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, button0.value(), button1.value()));
    }
    native static int __qt_information_QWidget_String_String_StandardButton_StandardButton(long parent, java.lang.String title, java.lang.String text, int button0, int button1);


/**
Opens a question message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton question(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons) {
        return question(parent, title, text, buttons, com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }

/**
Opens a question message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton question(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text) {
        return question(parent, title, text, new com.trolltech.qt.gui.QMessageBox.StandardButtons(1024), com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }
/**
Opens a question message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, {@link com.trolltech.qt.gui.QMessageBox#warning(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) warning()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton question(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QMessageBox.StandardButton defaultButton)    {
        return com.trolltech.qt.gui.QMessageBox.StandardButton.resolve(__qt_question_QWidget_String_String_StandardButtons_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, buttons.value(), defaultButton.value()));
    }
    native static int __qt_question_QWidget_String_String_StandardButtons_StandardButton(long parent, java.lang.String title, java.lang.String text, int buttons, int defaultButton);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static int question(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButton button0, com.trolltech.qt.gui.QMessageBox.StandardButton button1)    {
        return __qt_question_QWidget_String_String_StandardButton_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, button0.value(), button1.value());
    }
    native static int __qt_question_QWidget_String_String_StandardButton_StandardButton(long parent, java.lang.String title, java.lang.String text, int button0, int button1);


/**
Opens a warning message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton warning(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons) {
        return warning(parent, title, text, buttons, com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }

/**
Opens a warning message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton warning(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text) {
        return warning(parent, title, text, new com.trolltech.qt.gui.QMessageBox.StandardButtons(1024), com.trolltech.qt.gui.QMessageBox.StandardButton.NoButton);
    }
/**
Opens a warning message box with the specified <tt>title</tt> and <tt>text</tt>. The standard <tt>buttons</tt> are added to the message box. <tt>defaultButton</tt> specifies the button used when <b>Enter</b> is pressed. <tt>defaultButton</tt> must refer to a button that was given in <tt>buttons</tt>. If <tt>defaultButton</tt> is {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::NoButton }, QMessageBox chooses a suitable default automatically. <p>Returns the identity of the standard button that was clicked. If <b>Esc</b> was pressed instead, the escape button is returned. <p>If <tt>parent</tt> is 0, the message box is an {@link com.trolltech.qt.core.Qt.WindowModality application modal } dialog box. If <tt>parent</tt> is a widget, the message box is {@link com.trolltech.qt.core.Qt.WindowModality window modal } relative to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox#question(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) question()}, {@link com.trolltech.qt.gui.QMessageBox#information(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) information()}, and {@link com.trolltech.qt.gui.QMessageBox#critical(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QMessageBox.StandardButtons) critical()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMessageBox.StandardButton warning(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButtons buttons, com.trolltech.qt.gui.QMessageBox.StandardButton defaultButton)    {
        return com.trolltech.qt.gui.QMessageBox.StandardButton.resolve(__qt_warning_QWidget_String_String_StandardButtons_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, buttons.value(), defaultButton.value()));
    }
    native static int __qt_warning_QWidget_String_String_StandardButtons_StandardButton(long parent, java.lang.String title, java.lang.String text, int buttons, int defaultButton);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static int warning(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String text, com.trolltech.qt.gui.QMessageBox.StandardButton button0, com.trolltech.qt.gui.QMessageBox.StandardButton button1)    {
        return __qt_warning_QWidget_String_String_StandardButton_StandardButton(parent == null ? 0 : parent.nativeId(), title, text, button0.value(), button1.value());
    }
    native static int __qt_warning_QWidget_String_String_StandardButton_StandardButton(long parent, java.lang.String title, java.lang.String text, int button0, int button1);

/**
@exclude
*/

    public static native QMessageBox fromNativePointer(QNativePointer nativePointer);

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

    protected QMessageBox(QPrivateConstructor p) { super(p); } 
}
