package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QKeySequence class encapsulates a key sequence as used by shortcuts. In its most common form, a key sequence describes a combination of keys that must be used together to perform some action. Key sequences are used with {@link com.trolltech.qt.gui.QAction QAction} objects to specify which keyboard shortcuts can be used to trigger actions. <p>Key sequences can be constructed for use as keyboard shortcuts in three different ways: <ul><li> For standard shortcuts, a {@link com.trolltech.qt.gui.QKeySequence.StandardKey standard key } can be used to request the platform-specific key sequence associated with each shortcut.</li><li> For custom shortcuts, human-readable strings such as "Ctrl+X" can be used, and these can be translated into the appropriate shortcuts for users of different languages. Translations are made in the "{@link com.trolltech.qt.gui.QShortcut QShortcut}" context.</li><li> For hard-coded shortcuts, integer key codes can be specified with a combination of values defined by the {@link com.trolltech.qt.core.Qt.Key Qt::Key } and {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier } enum values. Each key code consists of a single {@link com.trolltech.qt.core.Qt.Key Qt::Key } value and zero or more modifiers, such as {@link com.trolltech.qt.core.Qt.Modifier Qt::SHIFT }, {@link com.trolltech.qt.core.Qt.Modifier Qt::CTRL }, {@link com.trolltech.qt.core.Qt.Modifier Qt::ALT } and {@link com.trolltech.qt.core.Qt.Modifier Qt::META }.</li></ul> For example, <b>Ctrl P</b> might be a sequence used as a shortcut for printing a document, and can be specified in any of the following ways: <pre class="snippet">
    new QKeySequence(QKeySequence.StandardKey.Print);
    new QKeySequence(tr("Ctrl+P"));
    new QKeySequence(tr("Ctrl+p"));
    new QKeySequence(Qt.Modifier.CTRL.value() + Qt.Key.Key_P.value());
</pre> Note that, for letters, the case used in the specification string does not matter. In the above examples, the user does not need to hold down the <b>Shift</b> key to activate a shortcut specified with "Ctrl+P". However, for other keys, the use of <b>Shift</b> as an unspecified extra modifier key can lead to confusion for users of an application whose keyboards have different layouts to those used by the developers. See the Keyboard Layout Issues section below for more details. <p>It is preferable to use standard shortcuts where possible. When creating key sequences for non-standard shortcuts, you should use human-readable strings in preference to hard-coded integer values. <p>QKeySequence objects can be cast to a QString to obtain a human-readable translated version of the sequence. Similarly, the {@link com.trolltech.qt.gui.QKeySequence#toString() toString()} function produces human-readable strings for use in menus. On Mac OS X, the appropriate symbols are used to describe keyboard shortcuts using special keys on the Macintosh keyboard. <p>An alternative way to specify hard-coded key codes is to use the Unicode code point of the character; for example, 'A' gives the same key sequence as {@link com.trolltech.qt.core.Qt.Key Qt::Key_A }. <p><b>Note:</b> On Mac OS X, references to "Ctrl", {@link com.trolltech.qt.core.Qt.Modifier Qt::CTRL }, Qt::Control and {@link com.trolltech.qt.core.Qt.KeyboardModifier Qt::ControlModifier } correspond to the <b>Command</b> keys on the Macintosh keyboard, and references to "Meta", {@link com.trolltech.qt.core.Qt.Modifier Qt::META }, Qt::Meta and {@link com.trolltech.qt.core.Qt.KeyboardModifier Qt::MetaModifier } correspond to the <b>Control</b> keys. Developers on Mac OS X can use the same shortcut descriptions across all platforms, and their applications will automatically work as expected on Mac OS X.<a name="standard-shortcuts"><h2>Standard Shortcuts</h2> QKeySequence defines many {@link com.trolltech.qt.gui.QKeySequence.StandardKey standard keyboard shortcuts } to reduce the amount of effort required when setting up actions in a typical application. The table below shows some common key sequences that are often used for these standard shortcuts by applications on four widely-used platforms. Note that on Mac OS X, the <b>Ctrl</b> value corresponds to the <b>Command</b> keys on the Macintosh keyboard, and the <b>Meta</b> value corresponds to the <b>Control</b> keys. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.gui.QKeySequence.StandardKey StandardKey }</center></th><th><center> Windows</center></th><th><center> Mac OS X</center></th><th><center> KDE</center></th><th><center> GNOME</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey HelpContents }</td><td> F1</td><td> Ctrl+?</td><td> F1</td><td> F1</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey WhatsThis }</td><td> Shift+F1</td><td> Shift+F1</td><td> Shift+F1</td><td> Shift+F1</td></tr><tr valign="top" class="even"><td> Open</td><td> Ctrl+O</td><td> Ctrl+O</td><td> Ctrl+O</td><td> Ctrl+O</td></tr><tr valign="top" class="odd"><td> Close</td><td> Ctrl+F4, Ctrl+W</td><td> Ctrl+W, Ctrl+F4</td><td> Ctrl+W</td><td> Ctrl+W</td></tr><tr valign="top" class="even"><td> Save</td><td> Ctrl+S</td><td> Ctrl+S</td><td> Ctrl+S</td><td> Ctrl+S</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SaveAs }</td><td></td><td> Ctrl+Shift+S</td><td></td><td> Ctrl+Shift+S</td></tr><tr valign="top" class="even"><td> New</td><td> Ctrl+N</td><td> Ctrl+N</td><td> Ctrl+N</td><td> Ctrl+N</td></tr><tr valign="top" class="odd"><td> Delete</td><td> Del</td><td> Del, Meta+D</td><td> Del, Ctrl+D</td><td> Del, Ctrl+D</td></tr><tr valign="top" class="even"><td> Cut</td><td> Ctrl+X, Shift+Del</td><td> Ctrl+X</td><td> Ctrl+X, F20, Shift+Del</td><td> Ctrl+X, F20, Shift+Del</td></tr><tr valign="top" class="odd"><td> Copy</td><td> Ctrl+C, Ctrl+Ins</td><td> Ctrl+C</td><td> Ctrl+C, F16, Ctrl+Ins</td><td> Ctrl+C, F16, Ctrl+Ins</td></tr><tr valign="top" class="even"><td> Paste</td><td> Ctrl+V, Shift+Ins</td><td> Ctrl+V</td><td> Ctrl+V, F18, Shift+Ins</td><td> Ctrl+V, F18, Shift+Ins</td></tr><tr valign="top" class="odd"><td> Undo</td><td> Ctrl+Z, Alt+Backspace</td><td> Ctrl+Z</td><td> Ctrl+Z, F14</td><td> Ctrl+Z, F14</td></tr><tr valign="top" class="even"><td> Redo</td><td> Ctrl+Y, Shift+Ctrl+Z, Alt+Shift+Backspace</td><td> Ctrl+Shift+Z, Ctrl+Y</td><td> Ctrl+Shift+Z</td><td> Ctrl+Shift+Z</td></tr><tr valign="top" class="odd"><td> Back</td><td> Alt+Left, Backspace</td><td> Ctrl+[</td><td> Alt+Left</td><td> Alt+Left</td></tr><tr valign="top" class="even"><td> Forward</td><td> Alt+Right, Shift+Backspace</td><td> Ctrl+]</td><td> Alt+Right</td><td> Alt+Right</td></tr><tr valign="top" class="odd"><td> Refresh</td><td> F5</td><td> F5</td><td> F5</td><td> Ctrl+R, F5</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey ZoomIn }</td><td> Ctrl+Plus</td><td> Ctrl+Plus</td><td> Ctrl+Plus</td><td> Ctrl+Plus</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey ZoomOut }</td><td> Ctrl+Minus</td><td> Ctrl+Minus</td><td> Ctrl+Minus</td><td> Ctrl+Minus</td></tr><tr valign="top" class="even"><td> Print</td><td> Ctrl+P</td><td> Ctrl+P</td><td> Ctrl+P</td><td> Ctrl+P</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey AddTab }</td><td> Ctrl+T</td><td> Ctrl+T</td><td> Ctrl+Shift+N, Ctrl+T</td><td> Ctrl+T</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey NextChild }</td><td> Ctrl+Tab, Forward, Ctrl+F6</td><td> Ctrl+}, Forward, Ctrl+Tab</td><td> Ctrl+Tab, Forward, Ctrl+Comma</td><td> Ctrl+Tab, Forward</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey PreviousChild }</td><td> Ctrl+Shift+Tab, Back, Ctrl+Shift+F6</td><td> Ctrl+{, Back, Ctrl+Shift+Tab</td><td> Ctrl+Shift+Tab, Back, Ctrl+Period</td><td> Ctrl+Shift+Tab, Back</td></tr><tr valign="top" class="even"><td> Find</td><td> Ctrl+F</td><td> Ctrl+F</td><td> Ctrl+F</td><td> Ctrl+F</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey FindNext }</td><td> F3, Ctrl+G</td><td> Ctrl+G</td><td> F3</td><td> Ctrl+G, F3</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey FindPrevious }</td><td> Shift+F3, Ctrl+Shift+G</td><td> Ctrl+Shift+G</td><td> Shift+F3</td><td> Ctrl+Shift+G, Shift+F3</td></tr><tr valign="top" class="odd"><td> Replace</td><td> Ctrl+H</td><td> (none)</td><td> Ctrl+R</td><td> Ctrl+H</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectAll }</td><td> Ctrl+A</td><td> Ctrl+A</td><td> Ctrl+A</td><td> Ctrl+A</td></tr><tr valign="top" class="odd"><td> Bold</td><td> Ctrl+B</td><td> Ctrl+B</td><td> Ctrl+B</td><td> Ctrl+B</td></tr><tr valign="top" class="even"><td> Italic</td><td> Ctrl+I</td><td> Ctrl+I</td><td> Ctrl+I</td><td> Ctrl+I</td></tr><tr valign="top" class="odd"><td> Underline</td><td> Ctrl+U</td><td> Ctrl+U</td><td> Ctrl+U</td><td> Ctrl+U</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToNextChar }</td><td> Right</td><td> Right</td><td> Right</td><td> Right</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToPreviousChar }</td><td> Left</td><td> Left</td><td> Left</td><td> Left</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToNextWord }</td><td> Ctrl+Right</td><td> Alt+Right</td><td> Ctrl+Right</td><td> Ctrl+Right</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToPreviousWord }</td><td> Ctrl+Left</td><td> Alt+Left</td><td> Ctrl+Left</td><td> Ctrl+Left</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToNextLine }</td><td> Down</td><td> Down</td><td> Down</td><td> Down</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToPreviousLine }</td><td> Up</td><td> Up</td><td> Up</td><td> Up</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToNextPage }</td><td> PgDown</td><td> PgDown, Alt+PgDown, Meta+Down, Meta+PgDown</td><td> PgDown</td><td> PgDown</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToPreviousPage }</td><td> PgUp</td><td> PgUp, Alt+PgUp, Meta+Up, Meta+PgUp</td><td> PgUp</td><td> PgUp</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToStartOfLine }</td><td> Home</td><td> Ctrl+Left, Meta+Left</td><td> Home</td><td> Home</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToEndOfLine }</td><td> End</td><td> Ctrl+Right, Meta+Right</td><td> End</td><td> End</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToStartOfBlock }</td><td> (none)</td><td> Alt+Up, Meta+A</td><td> (none)</td><td> (none)</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToEndOfBlock }</td><td> (none)</td><td> Alt+Down, Meta+E</td><td> (none)</td><td> (none)</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToStartOfDocument }</td><td> Ctrl+Home</td><td> Ctrl+Up, Home</td><td> Ctrl+Home</td><td> Ctrl+Home</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey MoveToEndOfDocument }</td><td> Ctrl+End</td><td> Ctrl+Down, End</td><td> Ctrl+End</td><td> Ctrl+End</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectNextChar }</td><td> Shift+Right</td><td> Shift+Right</td><td> Shift+Right</td><td> Shift+Right</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectPreviousChar }</td><td> Shift+Left</td><td> Shift+Left</td><td> Shift+Left</td><td> Shift?left</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectNextWord }</td><td> Ctrl+Shift+Right</td><td> Alt+Shift+Right</td><td> Ctrl+Shift+Right</td><td> Ctrl+Shift+Right</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectPreviousWord }</td><td> Ctrl+Shift+Left</td><td> Alt+Shift+Left</td><td> Ctrl+Shift+Left</td><td> Ctrl+Shift+Left</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectNextLine }</td><td> Shift+Down</td><td> Shift+Down</td><td> Shift+Down</td><td> Shift+Down</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectPreviousLine }</td><td> Shift+Up</td><td> Shift+Up</td><td> Shift+Up</td><td> Shift+Up</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectNextPage }</td><td> Shift+PgDown</td><td> Shift+PgDown</td><td> Shift+PgDown</td><td> Shift+PgDown</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectPreviousPage }</td><td> Shift+PgUp</td><td> Shift+PgUp</td><td> Shift+PgUp</td><td> Shift+PgUp</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectStartOfLine }</td><td> Shift+Home</td><td> Ctrl+Shift+Left</td><td> Shift+Home</td><td> Shift+Home</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectEndOfLine }</td><td> Shift+End</td><td> Ctrl+Shift+Right</td><td> Shift+End</td><td> Shift+End</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectStartOfBlock }</td><td> (none)</td><td> Alt+Shift+Up</td><td> (none)</td><td> (none)</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectEndOfBlock }</td><td> (none)</td><td> Alt+Shift+Down</td><td> (none)</td><td> (none)</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectStartOfDocument }</td><td> Ctrl+Shift+Home</td><td> Ctrl+Shift+Up, Shift+Home</td><td> Ctrl+Shift+Home</td><td> Ctrl+Shift+Home</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey SelectEndOfDocument }</td><td> Ctrl+Shift+End</td><td> Ctrl+Shift+Down, Shift+End</td><td> Ctrl+Shift+End</td><td> Ctrl+Shift+End</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey DeleteStartOfWord }</td><td> Ctrl+Backspace</td><td> Alt+Backspace</td><td> Ctrl+Backspace</td><td> Ctrl+Backspace</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey DeleteEndOfWord }</td><td> Ctrl+Del</td><td> (none)</td><td> Ctrl+Del</td><td> Ctrl+Del</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey DeleteEndOfLine }</td><td> (none)</td><td> (none)</td><td> Ctrl+K</td><td> Ctrl+K</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey InsertParagraphSeparator }</td><td> Enter</td><td> Enter</td><td> Enter</td><td> Enter</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QKeySequence.StandardKey InsertLineSeparator }</td><td> Shift+Enter</td><td> Meta+Enter</td><td> Shift+Enter</td><td> Shift+Enter</td></tr></table> Note that, since the key sequences used for the standard shortcuts differ between platforms, you still need to test your shortcuts on each platform to ensure that you do not unintentionally assign the same key sequence to many actions.<a name="keyboard-layout-issues"><h2>Keyboard Layout Issues</h2> Many key sequence specifications are chosen by developers based on the layout of certain types of keyboard, rather than choosing keys that represent the first letter of an action's name, such as <b>Ctrl S</b> ("Ctrl+S") or <b>Ctrl C</b> ("Ctrl+C"). Additionally, because certain symbols can only be entered with the help of modifier keys on certain keyboard layouts, key sequences intended for use with one keyboard layout may map to a different key, map to no keys at all, or require an additional modifier key to be used on different keyboard layouts. <p>For example, the shortcuts, <b>Ctrl plus</b> and <b>Ctrl minus</b>, are often used as shortcuts for zoom operations in graphics applications, and these may be specified as "Ctrl++" and "Ctrl+-" respectively. However, the way these shortcuts are specified and interpreted depends on the keyboard layout. Users of Norwegian keyboards will note that the <b>+</b> and <b>-</b> keys are not adjacent on the keyboard, but will still be able to activate both shortcuts without needing to press the <b>Shift</b> key. However, users with British keyboards will need to hold down the <b>Shift</b> key to enter the <b>+</b> symbol, making the shortcut effectively the same as "Ctrl+Shift+=". <p>Although some developers might resort to fully specifying all the modifiers they use on their keyboards to activate a shortcut, this will also result in unexpected behavior for users of different keyboard layouts. <p>For example, a developer using a British keyboard may decide to specify "Ctrl+Shift+=" as the key sequence in order to create a shortcut that coincidentally behaves in the same way as <b>Ctrl plus</b>. However, the <b>=</b> key needs to be accessed using the <b>Shift</b> key on Norwegian keyboard, making the required shortcut effectively <b>Ctrl Shift Shift =</b> (an impossible key combination). <p>As a result, both human-readable strings and hard-coded key codes can both be problematic to use when specifying a key sequence that can be used on a variety of different keyboard layouts. Only the use of {@link com.trolltech.qt.gui.QKeySequence.StandardKey standard shortcuts } guarantees that the user will be able to use the shortcuts that the developer intended. <p>Despite this, we can address this issue by ensuring that human-readable strings are used, making it possible for translations of key sequences to be made for users of different languages. This approach will be successful for users whose keyboards have the most typical layout for the language they are using.<a name="gnu-emacs-style-key-sequences"><h2>GNU Emacs Style Key Sequences</h2> Key sequences similar to those used in {@link <a href="../http-www-gnu-org-software-emacs.html">GNU Emacs</a>}, allowing up to four key codes, can be created by using the multiple argument constructor, or by passing a human-readable string of comma-separated key sequences. <p>For example, the key sequence, <b>Ctrl X</b> followed by <b>Ctrl C</b>, can be specified using either of the following ways: <pre class="snippet">
    new QKeySequence(tr("Ctrl+X, Ctrl+C"));
    new QKeySequence(Qt.Modifier.CTRL.value() + Qt.Key.Key_X.value(),
                     Qt.Modifier.CTRL.value() + Qt.Key.Key_C.value());
</pre> <b>Warning:</b> A {@link com.trolltech.qt.gui.QApplication QApplication} instance must have been constructed before a QKeySequence is created; otherwise, your application may crash. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShortcut QShortcut}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QKeySequence extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum SequenceFormat implements com.trolltech.qt.QtEnumerator {
/**
 The key sequence as a platform specific string. This means that it will be shown translated and on the Mac it will resemble a key sequence from the menu bar. This enum is best used when you want to display the string to the user.
*/

        NativeText(0),
/**
 The key sequence is given in a "portable" format, suitable for reading and writing to a file. In many cases, it will look similar to the native text on Windows and X11.
*/

        PortableText(1);

        SequenceFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QKeySequence$SequenceFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static SequenceFormat resolve(int value) {
            return (SequenceFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NativeText;
            case 1: return PortableText;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum represent standard key bindings. They can be used to assign platform dependent keyboard shortcuts to a {@link com.trolltech.qt.gui.QAction QAction}. {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent} also provides the function QKeyEvent::standardKey() to query if it matches an existing key binding. <p>Note that the key bindings are platform dependent. The currently bound shortcuts can be queried using {@link com.trolltech.qt.gui.QKeySequence#keyBindings(com.trolltech.qt.gui.QKeySequence.StandardKey) keyBindings()}.
*/

    public enum StandardKey implements com.trolltech.qt.QtEnumerator {
/**
 Unbound key.
*/

        UnknownKey(0),
/**
 Open help contents.
*/

        HelpContents(1),
/**
 Activate whats this.
*/

        WhatsThis(2),
/**
 Open document.
*/

        Open(3),
/**
 Close document/tab.
*/

        Close(4),
/**
 Save document.
*/

        Save(5),
/**
 Create new document.
*/

        New(6),
/**
 Delete.
*/

        Delete(7),
/**
 Cut.
*/

        Cut(8),
/**
 Copy.
*/

        Copy(9),
/**
 Paste.
*/

        Paste(10),
/**
 Undo.
*/

        Undo(11),
/**
 Redo.
*/

        Redo(12),
/**
 Navigate back.
*/

        Back(13),
/**
 Navigate forward.
*/

        Forward(14),
/**
 Refresh or reload current document.
*/

        Refresh(15),
/**
 Zoom in.
*/

        ZoomIn(16),
/**
 Zoom out.
*/

        ZoomOut(17),
/**
 Print document.
*/

        Print(18),
/**
 Add new tab.
*/

        AddTab(19),
/**
 Navigate to next tab or child window.
*/

        NextChild(20),
/**
 Navigate to previous tab or child window.
*/

        PreviousChild(21),
/**
 Find in document.
*/

        Find(22),
/**
 Find next result.
*/

        FindNext(23),
/**
 Find previous result.
*/

        FindPrevious(24),
/**
 Find and replace.
*/

        Replace(25),
/**
 Select all text.
*/

        SelectAll(26),
/**
 Bold text.
*/

        Bold(27),
/**
 Italic text.
*/

        Italic(28),
/**
 Underline text.
*/

        Underline(29),
/**
 Move cursor to next character.
*/

        MoveToNextChar(30),
/**
 Move cursor to previous character.
*/

        MoveToPreviousChar(31),
/**
 Move cursor to next word.
*/

        MoveToNextWord(32),
/**
 Move cursor to previous word.
*/

        MoveToPreviousWord(33),
/**
 Move cursor to next line.
*/

        MoveToNextLine(34),
/**
 Move cursor to previous line.
*/

        MoveToPreviousLine(35),
/**
 Move cursor to next page.
*/

        MoveToNextPage(36),
/**
 Move cursor to previous page.
*/

        MoveToPreviousPage(37),
/**
 Move cursor to start of line.
*/

        MoveToStartOfLine(38),
/**
 Move cursor to end of line.
*/

        MoveToEndOfLine(39),
/**
 Move cursor to start of a block. This shortcut is only used on OS X.
*/

        MoveToStartOfBlock(40),
/**
 Move cursor to end of block. This shortcut is only used on the OS X.
*/

        MoveToEndOfBlock(41),
/**
 Move cursor to start of document.
*/

        MoveToStartOfDocument(42),
/**
 Move cursor to end of document.
*/

        MoveToEndOfDocument(43),
/**
 Extend selection to next character.
*/

        SelectNextChar(44),
/**
 Extend selection to previous character.
*/

        SelectPreviousChar(45),
/**
 Extend selection to next word.
*/

        SelectNextWord(46),
/**
 Extend selection to previous word.
*/

        SelectPreviousWord(47),
/**
 Extend selection to next line.
*/

        SelectNextLine(48),
/**
 Extend selection to previous line.
*/

        SelectPreviousLine(49),
/**
 Extend selection to next page.
*/

        SelectNextPage(50),
/**
 Extend selection to previous page.
*/

        SelectPreviousPage(51),
/**
 Extend selection to start of line.
*/

        SelectStartOfLine(52),
/**
 Extend selection to end of line.
*/

        SelectEndOfLine(53),
/**
 Extend selection to the start of a text block. This shortcut is only used on OS X.
*/

        SelectStartOfBlock(54),
/**
 Extend selection to the end of a text block. This shortcut is only used on OS X.
*/

        SelectEndOfBlock(55),
/**
 Extend selection to start of document.
*/

        SelectStartOfDocument(56),
/**
 Extend selection to end of document.
*/

        SelectEndOfDocument(57),
/**
 Delete the beginning of a word up to the cursor.
*/

        DeleteStartOfWord(58),
/**
 Delete word from the end of the cursor.
*/

        DeleteEndOfWord(59),
/**
 Delete end of line.
*/

        DeleteEndOfLine(60),
/**
 Insert a new paragraph.
*/

        InsertParagraphSeparator(61),
/**
 Insert a new line.
*/

        InsertLineSeparator(62),
/**
 Save document after prompting the user for a file name.
*/

        SaveAs(63);

        StandardKey(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QKeySequence$StandardKey constant with the specified <tt>int</tt>.</brief>
*/

        public static StandardKey resolve(int value) {
            return (StandardKey) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnknownKey;
            case 1: return HelpContents;
            case 2: return WhatsThis;
            case 3: return Open;
            case 4: return Close;
            case 5: return Save;
            case 6: return New;
            case 7: return Delete;
            case 8: return Cut;
            case 9: return Copy;
            case 10: return Paste;
            case 11: return Undo;
            case 12: return Redo;
            case 13: return Back;
            case 14: return Forward;
            case 15: return Refresh;
            case 16: return ZoomIn;
            case 17: return ZoomOut;
            case 18: return Print;
            case 19: return AddTab;
            case 20: return NextChild;
            case 21: return PreviousChild;
            case 22: return Find;
            case 23: return FindNext;
            case 24: return FindPrevious;
            case 25: return Replace;
            case 26: return SelectAll;
            case 27: return Bold;
            case 28: return Italic;
            case 29: return Underline;
            case 30: return MoveToNextChar;
            case 31: return MoveToPreviousChar;
            case 32: return MoveToNextWord;
            case 33: return MoveToPreviousWord;
            case 34: return MoveToNextLine;
            case 35: return MoveToPreviousLine;
            case 36: return MoveToNextPage;
            case 37: return MoveToPreviousPage;
            case 38: return MoveToStartOfLine;
            case 39: return MoveToEndOfLine;
            case 40: return MoveToStartOfBlock;
            case 41: return MoveToEndOfBlock;
            case 42: return MoveToStartOfDocument;
            case 43: return MoveToEndOfDocument;
            case 44: return SelectNextChar;
            case 45: return SelectPreviousChar;
            case 46: return SelectNextWord;
            case 47: return SelectPreviousWord;
            case 48: return SelectNextLine;
            case 49: return SelectPreviousLine;
            case 50: return SelectNextPage;
            case 51: return SelectPreviousPage;
            case 52: return SelectStartOfLine;
            case 53: return SelectEndOfLine;
            case 54: return SelectStartOfBlock;
            case 55: return SelectEndOfBlock;
            case 56: return SelectStartOfDocument;
            case 57: return SelectEndOfDocument;
            case 58: return DeleteStartOfWord;
            case 59: return DeleteEndOfWord;
            case 60: return DeleteEndOfLine;
            case 61: return InsertParagraphSeparator;
            case 62: return InsertLineSeparator;
            case 63: return SaveAs;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum SequenceMatch implements com.trolltech.qt.QtEnumerator {
/**
 The key sequences are different; not even partially matching.
*/

        NoMatch(0),
/**
 The key sequences match partially, but are not the same.
*/

        PartialMatch(1),
/**
 The key sequences are the same.
*/

        ExactMatch(2);

        SequenceMatch(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QKeySequence$SequenceMatch constant with the specified <tt>int</tt>.</brief>
*/

        public static SequenceMatch resolve(int value) {
            return (SequenceMatch) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoMatch;
            case 1: return PartialMatch;
            case 2: return ExactMatch;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty key sequence.
*/

    public QKeySequence(){
        super((QPrivateConstructor)null);
        __qt_QKeySequence();
    }

    native void __qt_QKeySequence();

/**
Constructs a QKeySequence object for the given <tt>key</tt>. The result will depend on the currently running platform. <p>The resulting object will be based on the first element in the list of key bindings for the <tt>key</tt>.
*/

    public QKeySequence(com.trolltech.qt.gui.QKeySequence.StandardKey key){
        super((QPrivateConstructor)null);
        __qt_QKeySequence_StandardKey(key.value());
    }

    native void __qt_QKeySequence_StandardKey(int key);

/**
Copy constructor. Makes a copy of <tt>keysequence</tt>.
*/

    public QKeySequence(com.trolltech.qt.gui.QKeySequence ks){
        super((QPrivateConstructor)null);
        __qt_QKeySequence_QKeySequence(ks == null ? 0 : ks.nativeId());
    }

    native void __qt_QKeySequence_QKeySequence(long ks);

/**
Creates a key sequence from the <tt>key</tt> string. For example "Ctrl+O" gives CTRL+'O'. The strings "Ctrl", "Shift", "Alt" and "Meta" are recognized, as well as their translated equivalents in the "{@link com.trolltech.qt.gui.QShortcut QShortcut}" context (using QObject::tr()). <p>Up to four key codes may be entered by separating them with commas, e.g. "Alt+X,Ctrl+S,Q". <p>This constructor is typically used with tr(), so that shortcut keys can be replaced in translations: <pre class="snippet">
        QMenu file = new QMenu(this);
        file.addAction(tr("pen..."), this, "open()",
                          new QKeySequence(tr("Ctrl+O", "File|Open")));
</pre> Note the "File|Open" translator comment. It is by no means necessary, but it provides some context for the human translator.
*/

    public QKeySequence(java.lang.String key){
        super((QPrivateConstructor)null);
        __qt_QKeySequence_String(key);
    }

    native void __qt_QKeySequence_String(java.lang.String key);


/**
Constructs a key sequence with up to 4 keys <tt>k1</tt>, <tt>k2</tt>, <tt>k3</tt> and <tt>k4</tt>. <p>The key codes are listed in {@link com.trolltech.qt.core.Qt.Key Qt::Key } and can be combined with modifiers (see {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier }) such as {@link com.trolltech.qt.core.Qt.Modifier Qt::SHIFT }, {@link com.trolltech.qt.core.Qt.Modifier Qt::CTRL }, {@link com.trolltech.qt.core.Qt.Modifier Qt::ALT }, or {@link com.trolltech.qt.core.Qt.Modifier Qt::META }.
*/

    public QKeySequence(int k1, int k2, int k3) {
        this(k1, k2, k3, (int)0);
    }

/**
Constructs a key sequence with up to 4 keys <tt>k1</tt>, <tt>k2</tt>, <tt>k3</tt> and <tt>k4</tt>. <p>The key codes are listed in {@link com.trolltech.qt.core.Qt.Key Qt::Key } and can be combined with modifiers (see {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier }) such as {@link com.trolltech.qt.core.Qt.Modifier Qt::SHIFT }, {@link com.trolltech.qt.core.Qt.Modifier Qt::CTRL }, {@link com.trolltech.qt.core.Qt.Modifier Qt::ALT }, or {@link com.trolltech.qt.core.Qt.Modifier Qt::META }.
*/

    public QKeySequence(int k1, int k2) {
        this(k1, k2, (int)0, (int)0);
    }

/**
Constructs a key sequence with up to 4 keys <tt>k1</tt>, <tt>k2</tt>, <tt>k3</tt> and <tt>k4</tt>. <p>The key codes are listed in {@link com.trolltech.qt.core.Qt.Key Qt::Key } and can be combined with modifiers (see {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier }) such as {@link com.trolltech.qt.core.Qt.Modifier Qt::SHIFT }, {@link com.trolltech.qt.core.Qt.Modifier Qt::CTRL }, {@link com.trolltech.qt.core.Qt.Modifier Qt::ALT }, or {@link com.trolltech.qt.core.Qt.Modifier Qt::META }.
*/

    public QKeySequence(int k1) {
        this(k1, (int)0, (int)0, (int)0);
    }
/**
Constructs a key sequence with up to 4 keys <tt>k1</tt>, <tt>k2</tt>, <tt>k3</tt> and <tt>k4</tt>. <p>The key codes are listed in {@link com.trolltech.qt.core.Qt.Key Qt::Key } and can be combined with modifiers (see {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier }) such as {@link com.trolltech.qt.core.Qt.Modifier Qt::SHIFT }, {@link com.trolltech.qt.core.Qt.Modifier Qt::CTRL }, {@link com.trolltech.qt.core.Qt.Modifier Qt::ALT }, or {@link com.trolltech.qt.core.Qt.Modifier Qt::META }.
*/

    public QKeySequence(int k1, int k2, int k3, int k4){
        super((QPrivateConstructor)null);
        __qt_QKeySequence_int_int_int_int(k1, k2, k3, k4);
    }

    native void __qt_QKeySequence_int_int_int_int(int k1, int k2, int k3, int k4);

/**
Returns the number of keys in the key sequence. The maximum is 4.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns true if the key sequence is empty; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Matches the sequence with <tt>seq</tt>. Returns {@link com.trolltech.qt.gui.QKeySequence.SequenceMatch ExactMatch } if successful, {@link com.trolltech.qt.gui.QKeySequence.SequenceMatch PartialMatch } if <tt>seq</tt> matches incompletely, and {@link com.trolltech.qt.gui.QKeySequence.SequenceMatch NoMatch } if the sequences have nothing in common. Returns {@link com.trolltech.qt.gui.QKeySequence.SequenceMatch NoMatch } if <tt>seq</tt> is shorter.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QKeySequence.SequenceMatch matches(com.trolltech.qt.gui.QKeySequence seq)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QKeySequence.SequenceMatch.resolve(__qt_matches_QKeySequence(nativeId(), seq == null ? 0 : seq.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_matches_QKeySequence(long __this__nativeId, long seq);

    @QtBlockedSlot
    private final int operator_cast_int()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_cast_int(nativeId());
    }
    @QtBlockedSlot
    native int __qt_operator_cast_int(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.gui.QKeySequence ks)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QKeySequence(nativeId(), ks == null ? 0 : ks.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QKeySequence(long __this__nativeId, long ks);

/**
<brief>Writes thisQKeySequence
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long in);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QKeySequence other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QKeySequence(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QKeySequence(long __this__nativeId, long other);

/**
<brief>Reads a QKeySequence
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long out);

    @QtBlockedSlot
    private final int operator_subscript(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subscript_int(nativeId(), i);
    }
    @QtBlockedSlot
    native int __qt_operator_subscript_int(long __this__nativeId, int i);


/**
<brief>Returns a string representation of the <tt>this QKeySequence</tt>. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString() {
        return toString(com.trolltech.qt.gui.QKeySequence.SequenceFormat.PortableText);
    }
/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.gui.QKeySequence$SequenceFormat</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.gui.QKeySequence.SequenceFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_SequenceFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_SequenceFormat(long __this__nativeId, int format);


/**
Return a QKeySequence from the string <tt>str</tt> based on <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QKeySequence#toString() toString()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QKeySequence fromString(java.lang.String str) {
        return fromString(str, com.trolltech.qt.gui.QKeySequence.SequenceFormat.PortableText);
    }
/**
Return a QKeySequence from the string <tt>str</tt> based on <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QKeySequence#toString() toString()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QKeySequence fromString(java.lang.String str, com.trolltech.qt.gui.QKeySequence.SequenceFormat format)    {
        return __qt_fromString_String_SequenceFormat(str, format.value());
    }
    native static com.trolltech.qt.gui.QKeySequence __qt_fromString_String_SequenceFormat(java.lang.String str, int format);

/**
Returns a list of key bindings for the given <tt>key</tt>. The result of calling this function will vary based on the target platform. The first element of the list indicates the primary shortcut for the given platform. If the result contains more than one result, these can be considered alternative shortcuts on the same platform for the given <tt>key</tt>.
*/

    public static java.util.List<com.trolltech.qt.gui.QKeySequence> keyBindings(com.trolltech.qt.gui.QKeySequence.StandardKey key)    {
        return __qt_keyBindings_StandardKey(key.value());
    }
    native static java.util.List<com.trolltech.qt.gui.QKeySequence> __qt_keyBindings_StandardKey(int key);

/**
Returns the shortcut key sequence for the mnemonic in <tt>text</tt>, or an empty key sequence if no mnemonics are found. <p>For example, mnemonic("E&xit") returns <tt>Qt::ALT+Qt::Key_X</tt>, mnemonic("&Quit") returns <tt>ALT+Key_Q</tt>, and mnemonic("Quit") returns an empty QKeySequence. <p>We provide a {@link <a href="../accelerators.html">list of common mnemonics</a>} in English. At the time of writing, Microsoft and Open Group do not appear to have issued equivalent recommendations for other languages. <p><DT><b>See also:</b><br><DD>qt_set_sequence_auto_mnemonic(). <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QKeySequence mnemonic(java.lang.String text);

/**
@exclude
*/

    public static native QKeySequence fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QKeySequence(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QKeySequence array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QKeySequence)
        return operator_equal((com.trolltech.qt.gui.QKeySequence) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.gui.QKeySequence) {
            if (operator_less((com.trolltech.qt.gui.QKeySequence) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
For backward compatibility. returns the first keycode
as integer. If the key sequence is empty, 0 is returned.
*/

    @QtBlockedSlot
    public final int toInt() {
        return operator_cast_int();
    }

/**
Returns the key at index <tt>i</tt> in this key sequence.
*/

    @QtBlockedSlot
    public final int at(int i) {
        return operator_subscript(i);
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QKeySequence clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QKeySequence __qt_clone(long __this_nativeId);
}
