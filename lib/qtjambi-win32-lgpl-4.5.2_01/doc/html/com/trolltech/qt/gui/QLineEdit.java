package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QLineEdit widget is a one-line text editor. A line edit allows the user to enter and edit a single line of plain text with a useful collection of editing functions, including undo and redo, cut and paste, and drag and drop. <p>By changing the {@link com.trolltech.qt.gui.QLineEdit#echoMode() echoMode()} of a line edit, it can also be used as a "write-only" field, for inputs such as passwords. <p>The length of the text can be constrained to {@link com.trolltech.qt.gui.QLineEdit#maxLength() maxLength()}. The text can be arbitrarily constrained using a {@link com.trolltech.qt.gui.QLineEdit#validator() validator()} or an {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()}, or both. <p>A related class is {@link com.trolltech.qt.gui.QTextEdit QTextEdit} which allows multi-line, rich text editing. <p>You can change the text with {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()} or {@link com.trolltech.qt.gui.QLineEdit#insert(java.lang.String) insert()}. The text is retrieved with {@link com.trolltech.qt.gui.QLineEdit#text() text()}; the displayed text (which may be different, see {@link com.trolltech.qt.gui.QLineEdit.EchoMode EchoMode }) is retrieved with {@link com.trolltech.qt.gui.QLineEdit#displayText() displayText()}. Text can be selected with {@link com.trolltech.qt.gui.QLineEdit#setSelection(int, int) setSelection()} or {@link com.trolltech.qt.gui.QLineEdit#selectAll() selectAll()}, and the selection can be {@link com.trolltech.qt.gui.QLineEdit#cut() cut()}, {@link com.trolltech.qt.gui.QLineEdit#copy() copy()}ied and {@link com.trolltech.qt.gui.QLineEdit#paste() paste()}d. The text can be aligned with {@link com.trolltech.qt.gui.QLineEdit#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <p>When the text changes the {@link com.trolltech.qt.gui.QLineEdit#textChanged textChanged() } signal is emitted; when the text changes other than by calling {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()} the {@link com.trolltech.qt.gui.QLineEdit#textEdited textEdited() } signal is emitted; when the cursor is moved the {@link com.trolltech.qt.gui.QLineEdit#cursorPositionChanged cursorPositionChanged() } signal is emitted; and when the Return or Enter key is pressed the {@link com.trolltech.qt.gui.QLineEdit#returnPressed returnPressed() } signal is emitted. <p>When editing is finished, either because the line edit lost focus or Return/Enter is pressed the {@link com.trolltech.qt.gui.QLineEdit#editingFinished editingFinished() } signal is emitted. <p>Note that if there is a validator set on the line edit, the {@link com.trolltech.qt.gui.QLineEdit#returnPressed returnPressed() }/{@link com.trolltech.qt.gui.QLineEdit#editingFinished editingFinished() } signals will only be emitted if the validator returns {@link com.trolltech.qt.gui.QValidator.State QValidator::Acceptable }. <p>By default, QLineEdits have a frame as specified by the Windows and Motif style guides; you can turn it off by calling setFrame(false). <p>The default key bindings are described below. The line edit also provides a context menu (usually invoked by a right mouse click) that presents some of these editing options. <a name="desc"> <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Keypress</center></th><th><center> Action</center></th></tr></thead><tr valign="top" class="even"><td> Left Arrow</td><td> Moves the cursor one character to the left.</td></tr><tr valign="top" class="odd"><td> Shift+Left Arrow</td><td> Moves and selects text one character to the left.</td></tr><tr valign="top" class="even"><td> Right Arrow</td><td> Moves the cursor one character to the right.</td></tr><tr valign="top" class="odd"><td> Shift+Right Arrow</td><td> Moves and selects text one character to the right.</td></tr><tr valign="top" class="even"><td> Home</td><td> Moves the cursor to the beginning of the line.</td></tr><tr valign="top" class="odd"><td> End</td><td> Moves the cursor to the end of the line.</td></tr><tr valign="top" class="even"><td> Backspace</td><td> Deletes the character to the left of the cursor.</td></tr><tr valign="top" class="odd"><td> Ctrl+Backspace</td><td> Deletes the word to the left of the cursor.</td></tr><tr valign="top" class="even"><td> Delete</td><td> Deletes the character to the right of the cursor.</td></tr><tr valign="top" class="odd"><td> Ctrl+Delete</td><td> Deletes the word to the right of the cursor.</td></tr><tr valign="top" class="even"><td> Ctrl+A</td><td> Select all.</td></tr><tr valign="top" class="odd"><td> Ctrl+C</td><td> Copies the selected text to the clipboard.</td></tr><tr valign="top" class="even"><td> Ctrl+Insert</td><td> Copies the selected text to the clipboard.</td></tr><tr valign="top" class="odd"><td> Ctrl+K</td><td> Deletes to the end of the line.</td></tr><tr valign="top" class="even"><td> Ctrl+V</td><td> Pastes the clipboard text into line edit.</td></tr><tr valign="top" class="odd"><td> Shift+Insert</td><td> Pastes the clipboard text into line edit.</td></tr><tr valign="top" class="even"><td> Ctrl+X</td><td> Deletes the selected text and copies it to the clipboard.</td></tr><tr valign="top" class="odd"><td> Shift+Delete</td><td> Deletes the selected text and copies it to the clipboard.</td></tr><tr valign="top" class="even"><td> Ctrl+Z</td><td> Undoes the last operation.</td></tr><tr valign="top" class="odd"><td> Ctrl+Y</td><td> Redoes the last undone operation.</td></tr></table> Any other key sequence that represents a valid character, will cause the character to be inserted into the line edit. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-lineedit.png"></center><br></td><td> A line edit shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windows-lineedit.png"></center><br></td><td> A line edit shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-lineedit.png"></center><br></td><td> A line edit shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit QTextEdit}, {@link com.trolltech.qt.gui.QLabel QLabel}, {@link com.trolltech.qt.gui.QComboBox QComboBox}, {@link <a href="../guibooks.html">GUI Design Handbook: Field, Entry</a>}, and {@link <a href="../qtjambi-lineedits.html">Line Edits Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLineEdit extends com.trolltech.qt.gui.QWidget
{

    private Object __rcCompleter = null;

    private Object __rcValidator = null;
/**
This enum type describes how a line edit should display its contents. <p><DT><b>See also:</b><br><DD>setEchoMode(), and echoMode(). <br></DD></DT>
*/

    public enum EchoMode implements com.trolltech.qt.QtEnumerator {
/**
 Display characters as they are entered. This is the default.
*/

        Normal(0),
/**
 Do not display anything. This may be appropriate for passwords where even the length of the password should be kept secret.
*/

        NoEcho(1),
/**
 Display asterisks instead of the characters actually entered.
*/

        Password(2),
/**
 Display characters as they are entered while editing otherwise display asterisks.
*/

        PasswordEchoOnEdit(3);

        EchoMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLineEdit$EchoMode constant with the specified <tt>int</tt>.</brief>
*/

        public static EchoMode resolve(int value) {
            return (EchoMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Normal;
            case 1: return NoEcho;
            case 2: return Password;
            case 3: return PasswordEchoOnEdit;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: old), java.lang.Integer(named: new)&gt;:<p> This signal is emitted whenever the cursor moves. The previous position is given by <tt>old</tt>, and the new position by <tt>new</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setCursorPosition(int) setCursorPosition()}, and {@link com.trolltech.qt.gui.QLineEdit#cursorPosition() cursorPosition()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cursorPositionChanged = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cursorPositionChanged(int arg__1, int arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorPositionChanged_int_int(nativeId(), arg__1, arg__2);
    }
    native void __qt_cursorPositionChanged_int_int(long __this__nativeId, int arg__1, int arg__2);
/**
 This signal is emitted when the Return or Enter key is pressed or the line edit loses focus. Note that if there is a {@link com.trolltech.qt.gui.QLineEdit#validator() validator()} or {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()} set on the line edit and enter/return is pressed, the {@link com.trolltech.qt.gui.QLineEdit#editingFinished editingFinished() } signal will only be emitted if the input follows the {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()} and the {@link com.trolltech.qt.gui.QLineEdit#validator() validator()} returns {@link com.trolltech.qt.gui.QValidator.State QValidator::Acceptable }.
*/

    public final Signal0 editingFinished = new Signal0();

    private final void editingFinished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editingFinished(nativeId());
    }
    native void __qt_editingFinished(long __this__nativeId);
/**
 This signal is emitted when the Return or Enter key is pressed. Note that if there is a {@link com.trolltech.qt.gui.QLineEdit#validator() validator()} or {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()} set on the line edit, the {@link com.trolltech.qt.gui.QLineEdit#returnPressed returnPressed() } signal will only be emitted if the input follows the {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()} and the {@link com.trolltech.qt.gui.QLineEdit#validator() validator()} returns {@link com.trolltech.qt.gui.QValidator.State QValidator::Acceptable }.
*/

    public final Signal0 returnPressed = new Signal0();

    private final void returnPressed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_returnPressed(nativeId());
    }
    native void __qt_returnPressed(long __this__nativeId);
/**
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#hasSelectedText() hasSelectedText()}, and {@link com.trolltech.qt.gui.QLineEdit#selectedText() selectedText()}. <br></DD></DT>
*/

    public final Signal0 selectionChanged = new Signal0();

    private final void selectionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged(nativeId());
    }
    native void __qt_selectionChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is emitted whenever the text changes. The <tt>text</tt> argument is the new text. <p>Unlike {@link com.trolltech.qt.gui.QLineEdit#textEdited textEdited() }, this signal is also emitted when the text is changed programmatically, for example, by calling {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}.
*/

    public final Signal1<java.lang.String> textChanged = new Signal1<java.lang.String>();

    private final void textChanged(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_textChanged_String(nativeId(), arg__1);
    }
    native void __qt_textChanged_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is emitted whenever the text is edited. The <tt>text</tt> argument is the next text. <p>Unlike {@link com.trolltech.qt.gui.QLineEdit#textChanged textChanged() }, this signal is not emitted when the text is changed programmatically, for example, by calling {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}.
*/

    public final Signal1<java.lang.String> textEdited = new Signal1<java.lang.String>();

    private final void textEdited(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_textEdited_String(nativeId(), arg__1);
    }
    native void __qt_textEdited_String(long __this__nativeId, java.lang.String arg__1);


/**
Constructs a line edit with no text. <p>The maximum text length is set to 32767 characters. <p>The <tt>parent</tt> argument is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QLineEdit#setMaxLength(int) setMaxLength()}. <br></DD></DT>
*/

    public QLineEdit() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a line edit with no text. <p>The maximum text length is set to 32767 characters. <p>The <tt>parent</tt> argument is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QLineEdit#setMaxLength(int) setMaxLength()}. <br></DD></DT>
*/

    public QLineEdit(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QLineEdit_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLineEdit_QWidget(long parent);


/**
Constructs a line edit containing the text <tt>contents</tt>. <p>The cursor position is set to the end of the line and the maximum text length to 32767 characters. <p>The <tt>parent</tt> and argument is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#text() text()}, and {@link com.trolltech.qt.gui.QLineEdit#setMaxLength(int) setMaxLength()}. <br></DD></DT>
*/

    public QLineEdit(java.lang.String arg__1) {
        this(arg__1, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a line edit containing the text <tt>contents</tt>. <p>The cursor position is set to the end of the line and the maximum text length to 32767 characters. <p>The <tt>parent</tt> and argument is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#text() text()}, and {@link com.trolltech.qt.gui.QLineEdit#setMaxLength(int) setMaxLength()}. <br></DD></DT>
*/

    public QLineEdit(java.lang.String arg__1, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QLineEdit_String_QWidget(arg__1, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLineEdit_String_QWidget(java.lang.String arg__1, long parent);

/**
This property holds the alignment of the line edit. Both horizontal and vertical alignment is allowed here, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignJustify } will map to {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }. <p>By default, this property contains a combination of {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignVCenter }. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="alignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
If no text is selected, deletes the character to the left of the text cursor and moves the cursor one position to the left. If any text is selected, the cursor is moved to the beginning of the selected text and the selected text is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#del() del()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void backspace()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_backspace(nativeId());
    }
    @QtBlockedSlot
    native void __qt_backspace(long __this__nativeId);

/**
Clears the contents of the line edit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QLineEdit#insert(java.lang.String) insert()}. <br></DD></DT>
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Returns the current {@link com.trolltech.qt.gui.QCompleter QCompleter} that provides completions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setCompleter(com.trolltech.qt.gui.QCompleter) setCompleter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCompleter completer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QCompleter __qt_completer(long __this__nativeId);

/**
Copies the selected text to the clipboard, if there is any, and if {@link com.trolltech.qt.gui.QLineEdit#echoMode() echoMode()} is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cut() cut()}, and {@link com.trolltech.qt.gui.QLineEdit#paste() paste()}. <br></DD></DT>
*/

    public final void copy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_copy(nativeId());
    }
    native void __qt_copy(long __this__nativeId);

/**
This function creates the standard context menu which is shown when the user clicks on the line edit with the right mouse button. It is called from the default contextMenuEvent() handler. The popup menu's ownership is transferred to the caller.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu createStandardContextMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createStandardContextMenu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_createStandardContextMenu(long __this__nativeId);


/**
Moves the cursor back <tt>steps</tt> characters. If <tt>mark</tt> is true each character moved over is added to the selection; if <tt>mark</tt> is false the selection is cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cursorForward(boolean) cursorForward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cursorBackward(boolean mark) {
        cursorBackward(mark, (int)1);
    }
/**
Moves the cursor back <tt>steps</tt> characters. If <tt>mark</tt> is true each character moved over is added to the selection; if <tt>mark</tt> is false the selection is cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cursorForward(boolean) cursorForward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cursorBackward(boolean mark, int steps)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorBackward_boolean_int(nativeId(), mark, steps);
    }
    @QtBlockedSlot
    native void __qt_cursorBackward_boolean_int(long __this__nativeId, boolean mark, int steps);


/**
Moves the cursor forward <tt>steps</tt> characters. If <tt>mark</tt> is true each character moved over is added to the selection; if <tt>mark</tt> is false the selection is cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cursorBackward(boolean) cursorBackward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cursorForward(boolean mark) {
        cursorForward(mark, (int)1);
    }
/**
Moves the cursor forward <tt>steps</tt> characters. If <tt>mark</tt> is true each character moved over is added to the selection; if <tt>mark</tt> is false the selection is cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cursorBackward(boolean) cursorBackward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cursorForward(boolean mark, int steps)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorForward_boolean_int(nativeId(), mark, steps);
    }
    @QtBlockedSlot
    native void __qt_cursorForward_boolean_int(long __this__nativeId, boolean mark, int steps);

/**
This property holds the current cursor position for this line edit. Setting the cursor position causes a repaint when appropriate. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="cursorPosition")
    @QtBlockedSlot
    public final int cursorPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_cursorPosition(long __this__nativeId);

/**
Returns the cursor position under the point <tt>pos</tt>.
*/

    @QtBlockedSlot
    public final int cursorPositionAt(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorPositionAt_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native int __qt_cursorPositionAt_QPoint(long __this__nativeId, long pos);

/**
Returns a rectangle that includes the lineedit cursor.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect cursorRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_cursorRect(long __this__nativeId);

/**
Moves the cursor one word backward. If <tt>mark</tt> is true, the word is also selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cursorWordForward(boolean) cursorWordForward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cursorWordBackward(boolean mark)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorWordBackward_boolean(nativeId(), mark);
    }
    @QtBlockedSlot
    native void __qt_cursorWordBackward_boolean(long __this__nativeId, boolean mark);

/**
Moves the cursor one word forward. If <tt>mark</tt> is true, the word is also selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#cursorWordBackward(boolean) cursorWordBackward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cursorWordForward(boolean mark)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorWordForward_boolean(nativeId(), mark);
    }
    @QtBlockedSlot
    native void __qt_cursorWordForward_boolean(long __this__nativeId, boolean mark);

/**
Copies the selected text to the clipboard and deletes it, if there is any, and if {@link com.trolltech.qt.gui.QLineEdit#echoMode() echoMode()} is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }. <p>If the current validator disallows deleting the selected text, {@link com.trolltech.qt.gui.QLineEdit#cut() cut()} will copy without deleting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#copy() copy()}, {@link com.trolltech.qt.gui.QLineEdit#paste() paste()}, and {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}. <br></DD></DT>
*/

    public final void cut()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cut(nativeId());
    }
    native void __qt_cut(long __this__nativeId);

/**
If no text is selected, deletes the character to the right of the text cursor. If any text is selected, the cursor is moved to the beginning of the selected text and the selected text is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#backspace() backspace()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void del()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_del(nativeId());
    }
    @QtBlockedSlot
    native void __qt_del(long __this__nativeId);

/**
Deselects any selected text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setSelection(int, int) setSelection()}, and {@link com.trolltech.qt.gui.QLineEdit#selectAll() selectAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void deselect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deselect(nativeId());
    }
    @QtBlockedSlot
    native void __qt_deselect(long __this__nativeId);

/**
This property holds the displayed text. If {@link QLineEdit#echoMode() echoMode} is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal } this returns the same as {@link com.trolltech.qt.gui.QLineEdit#text() text()}; if {@link com.trolltech.qt.gui.QLineEdit.EchoMode EchoMode } is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Password } or {@link com.trolltech.qt.gui.QLineEdit.EchoMode PasswordEchoOnEdit } it returns a string of asterisks {@link com.trolltech.qt.gui.QLineEdit#text() text()}.length() characters long, e.g. "******"; if {@link com.trolltech.qt.gui.QLineEdit.EchoMode EchoMode } is {@link com.trolltech.qt.gui.QLineEdit.EchoMode NoEcho } returns an empty string, "". <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode) setEchoMode()}, {@link com.trolltech.qt.gui.QLineEdit#text() text()}, and {@link com.trolltech.qt.gui.QLineEdit.EchoMode EchoMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="displayText")
    @QtBlockedSlot
    public final java.lang.String displayText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_displayText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_displayText(long __this__nativeId);

/**
This property holds whether the lineedit starts a drag if the user presses and moves the mouse on some selected text. Dragging is disabled by default.
*/

    @com.trolltech.qt.QtPropertyReader(name="dragEnabled")
    @QtBlockedSlot
    public final boolean dragEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dragEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_dragEnabled(long __this__nativeId);

/**
This property holds the line edit's echo mode. The echo mode determines how the text entered in the line edit is displayed (or echoed) to the user. <p>The most common setting is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }, in which the text entered by the user is displayed verbatim, but QLineEdit also supports modes that allow the entered text to be suppressed or obscured: these include {@link com.trolltech.qt.gui.QLineEdit.EchoMode NoEcho }, {@link com.trolltech.qt.gui.QLineEdit.EchoMode Password } and {@link com.trolltech.qt.gui.QLineEdit.EchoMode PasswordEchoOnEdit }. <p>The widget's display and the ability to copy or drag the text is affected by this setting. <p>By default, this property is set to {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit.EchoMode EchoMode }, and {@link com.trolltech.qt.gui.QLineEdit#displayText() displayText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="echoMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineEdit.EchoMode echoMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QLineEdit.EchoMode.resolve(__qt_echoMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_echoMode(long __this__nativeId);

/**
Moves the text cursor to the end of the line unless it is already there. If <tt>mark</tt> is true, text is selected towards the last position; otherwise, any selected text is unselected if the cursor is moved. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#home(boolean) home()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void end(boolean mark)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_end_boolean(nativeId(), mark);
    }
    @QtBlockedSlot
    native void __qt_end_boolean(long __this__nativeId, boolean mark);

    @QtBlockedSlot
    private final void getTextMargins_private(com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getTextMargins_private_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_getTextMargins_private_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom);

/**
This property holds whether the input satisfies the {@link QLineEdit#inputMask() inputMask} and the validator.. By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setInputMask(java.lang.String) setInputMask()}, and {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="acceptableInput")
    @QtBlockedSlot
    public final boolean hasAcceptableInput()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAcceptableInput(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasAcceptableInput(long __this__nativeId);

/**
This property holds whether the line edit draws itself with a frame. If enabled (the default) the line edit draws itself inside a frame, otherwise the line edit draws itself without any frame.
*/

    @com.trolltech.qt.QtPropertyReader(name="frame")
    @QtBlockedSlot
    public final boolean hasFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFrame(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFrame(long __this__nativeId);

/**
This property holds whether there is any text selected. {@link com.trolltech.qt.gui.QLineEdit#hasSelectedText() hasSelectedText()} returns true if some or all of the text has been selected by the user; otherwise returns false. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#selectedText() selectedText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="hasSelectedText")
    @QtBlockedSlot
    public final boolean hasSelectedText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasSelectedText(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasSelectedText(long __this__nativeId);

/**
Moves the text cursor to the beginning of the line unless it is already there. If <tt>mark</tt> is true, text is selected towards the first position; otherwise, any selected text is unselected if the cursor is moved. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#end(boolean) end()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void home(boolean mark)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_home_boolean(nativeId(), mark);
    }
    @QtBlockedSlot
    native void __qt_home_boolean(long __this__nativeId, boolean mark);

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
This property holds The validation input mask. If no mask is set, {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()} returns an empty string. <p>Sets the QLineEdit's validation mask. Validators can be used instead of, or in conjunction with masks; see {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}. <p>Unset the mask and return to normal QLineEdit operation by passing an empty string ("") or just calling {@link com.trolltech.qt.gui.QLineEdit#setInputMask(java.lang.String) setInputMask()} with no arguments. <p>The table below shows the characters that can be used in an input mask. A space character, the default character for a blank, is needed for cases where a character is permitted but not required. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Character</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> <tt>A</tt></td><td> ASCII alphabetic character required. A-Z, a-z.</td></tr><tr valign="top" class="odd"><td> <tt>a</tt></td><td> ASCII alphabetic character permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>N</tt></td><td> ASCII alphanumeric character required. A-Z, a-z, 0-9.</td></tr><tr valign="top" class="odd"><td> <tt>n</tt></td><td> ASCII alphanumeric character permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>X</tt></td><td> Any character required.</td></tr><tr valign="top" class="odd"><td> <tt>x</tt></td><td> Any character permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>9</tt></td><td> ASCII digit required. 0-9.</td></tr><tr valign="top" class="odd"><td> <tt>0</tt></td><td> ASCII digit permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>D</tt></td><td> ASCII digit required. 1-9.</td></tr><tr valign="top" class="odd"><td> <tt>d</tt></td><td> ASCII digit permitted but not required (1-9).</td></tr><tr valign="top" class="even"><td> <tt>#</tt></td><td> ASCII digit or plus/minus sign permitted but not required.</td></tr><tr valign="top" class="odd"><td> <tt>H</tt></td><td> Hexadecimal character required. A-F, a-f, 0-9.</td></tr><tr valign="top" class="even"><td> <tt>h</tt></td><td> Hexadecimal character permitted but not required.</td></tr><tr valign="top" class="odd"><td> <tt>B</tt></td><td> Binary character required. 0-1.</td></tr><tr valign="top" class="even"><td> <tt>b</tt></td><td> Binary character permitted but not required.</td></tr><tr valign="top" class="odd"><td> <tt>&gt;</tt></td><td> All following alphabetic characters are uppercased.</td></tr><tr valign="top" class="even"><td> <tt>&lt;</tt></td><td> All following alphabetic characters are lowercased.</td></tr><tr valign="top" class="odd"><td> <tt>!</tt></td><td> Switch off case conversion.</td></tr><tr valign="top" class="even"><td> <tt>\</tt></td><td> Use <tt>\</tt> to escape the special characters listed above to use them as separators.</td></tr></table> The mask consists of a string of mask characters and separators, optionally followed by a semicolon and the character used for blanks. The blank characters are always removed from the text after editing. <p>Examples: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Mask</center></th><th><center> Notes</center></th></tr></thead><tr valign="top" class="even"><td> <tt>000.000.000.000;_</tt></td><td> IP address; blanks are <tt>_</tt>.</td></tr><tr valign="top" class="odd"><td> <tt>HH:HH:HH:HH:HH:HH;_</tt></td><td> MAC address</td></tr><tr valign="top" class="even"><td> <tt>0000-00-00</tt></td><td> ISO Date; blanks are <tt>space</tt></td></tr><tr valign="top" class="odd"><td> <tt>&gt;AAAAA-AAAAA-AAAAA-AAAAA-AAAAA;#</tt></td><td> License number; blanks are <tt>-</tt> and all (alphabetic) characters are converted to uppercase.</td></tr></table> To get range control (e.g., for an IP address) use masks together with {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) validators}. <p><DT><b>See also:</b><br><DD>{@link QLineEdit#maxLength() maxLength}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="inputMask")
    @QtBlockedSlot
    public final java.lang.String inputMask()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMask(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_inputMask(long __this__nativeId);

/**
Deletes any selected text, inserts <tt>newText</tt>, and validates the result. If it is valid, it sets it as the new contents of the line edit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QLineEdit#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insert(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insert_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_insert_String(long __this__nativeId, java.lang.String arg__1);

/**
This property holds whether the line edit's contents has been modified by the user. The modified flag is never read by QLineEdit; it has a default value of false and is changed to true whenever the user changes the line edit's contents. <p>This is useful for things that need to provide a default value but do not start out knowing what the default should be (perhaps it depends on other fields on the form). Start the line edit without the best default, and when the default is known, if modified() returns false (the user hasn't entered any text), insert the default value. <p>Calling {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()} resets the modified flag to false.
*/

    @com.trolltech.qt.QtPropertyReader(name="modified")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean isModified()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isModified(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isModified(long __this__nativeId);

/**
This property holds whether the line edit is read only.  In read-only mode, the user can still copy the text to the clipboard, or drag and drop the text (if {@link com.trolltech.qt.gui.QLineEdit#echoMode() echoMode()} is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }), but cannot edit it. <p>QLineEdit does not show a cursor in read-only mode. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>setEnabled(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="readOnly")
    @QtBlockedSlot
    public final boolean isReadOnly()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadOnly(long __this__nativeId);

/**
This property holds whether redo is available. Redo becomes available once the user has performed one or more undo operations on text in the line edit. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="redoAvailable")
    @QtBlockedSlot
    public final boolean isRedoAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRedoAvailable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRedoAvailable(long __this__nativeId);

/**
This property holds whether undo is available. Undo becomes available once the user has modified the text in the line edit. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="undoAvailable")
    @QtBlockedSlot
    public final boolean isUndoAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isUndoAvailable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isUndoAvailable(long __this__nativeId);

/**
This property holds the maximum permitted length of the text. If the text is too long, it is truncated at the limit. <p>If truncation occurs any selected text will be unselected, the cursor position is set to 0 and the first part of the string is shown. <p>If the line edit has an input mask, the mask defines the maximum string length. <p>By default, this property contains a value of 32767. <p><DT><b>See also:</b><br><DD>{@link QLineEdit#inputMask() inputMask}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maxLength")
    @QtBlockedSlot
    public final int maxLength()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxLength(long __this__nativeId);

/**
Inserts the clipboard's text at the cursor position, deleting any selected text, providing the line edit is not {@link QLineEdit#isReadOnly() read-only}. <p>If the end result would not be acceptable to the current {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) validator}, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#copy() copy()}, and {@link com.trolltech.qt.gui.QLineEdit#cut() cut()}. <br></DD></DT>
*/

    public final void paste()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paste(nativeId());
    }
    native void __qt_paste(long __this__nativeId);

/**
Redoes the last operation if redo is {@link QLineEdit#isRedoAvailable() available}.
*/

    public final void redo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    native void __qt_redo(long __this__nativeId);

/**
Selects all the text (i. . highlights it) and moves the cursor to the end. This is useful when a default value has been inserted because if the user types before clicking on the widget, the selected text will be deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setSelection(int, int) setSelection()}, and {@link com.trolltech.qt.gui.QLineEdit#deselect() deselect()}. <br></DD></DT>
*/

    public final void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    native void __qt_selectAll(long __this__nativeId);

/**
This property holds the selected text. If there is no selected text this property's value is an empty string. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#hasSelectedText() hasSelectedText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="selectedText")
    @QtBlockedSlot
    public final java.lang.String selectedText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_selectedText(long __this__nativeId);

/**
{@link com.trolltech.qt.gui.QLineEdit#selectionStart() selectionStart()} returns the index of the first selected character in the line edit or -1 if no text is selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#selectedText() selectedText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int selectionStart()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectionStart(nativeId());
    }
    @QtBlockedSlot
    native int __qt_selectionStart(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... flag) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(flag));
    }
/**
This property holds the alignment of the line edit. Both horizontal and vertical alignment is allowed here, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignJustify } will map to {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }. <p>By default, this property contains a combination of {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignVCenter }. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="alignment")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment flag)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), flag.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int flag);

/**
Sets this line edit to provide auto completions from the completer, <tt>c</tt>. The completion mode is set using {@link QCompleter#setCompletionMode(com.trolltech.qt.gui.QCompleter.CompletionMode) QCompleter::setCompletionMode()}. <p>To use a {@link com.trolltech.qt.gui.QCompleter QCompleter} with a {@link com.trolltech.qt.gui.QValidator QValidator} or {@link QLineEdit#inputMask() QLineEdit::inputMask}, you need to ensure that the model provided to {@link com.trolltech.qt.gui.QCompleter QCompleter} contains valid entries. You can use the {@link com.trolltech.qt.gui.QSortFilterProxyModel QSortFilterProxyModel} to ensure that the {@link com.trolltech.qt.gui.QCompleter QCompleter}'s model contains only valid entries. <p>If <tt>c</tt> == 0, {@link com.trolltech.qt.gui.QLineEdit#setCompleter(com.trolltech.qt.gui.QCompleter) setCompleter()} removes the current completer, effectively disabling auto completion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#completer() completer()}, and {@link com.trolltech.qt.gui.QCompleter QCompleter}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCompleter(com.trolltech.qt.gui.QCompleter completer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcCompleter = completer;
        }
        __qt_setCompleter_QCompleter(nativeId(), completer == null ? 0 : completer.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCompleter_QCompleter(long __this__nativeId, long completer);

/**
This property holds the current cursor position for this line edit. Setting the cursor position causes a repaint when appropriate. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyWriter(name="cursorPosition")
    @QtBlockedSlot
    public final void setCursorPosition(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursorPosition_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setCursorPosition_int(long __this__nativeId, int arg__1);

/**
This property holds whether the lineedit starts a drag if the user presses and moves the mouse on some selected text. Dragging is disabled by default.
*/

    @com.trolltech.qt.QtPropertyWriter(name="dragEnabled")
    @QtBlockedSlot
    public final void setDragEnabled(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragEnabled_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setDragEnabled_boolean(long __this__nativeId, boolean b);

/**
This property holds the line edit's echo mode. The echo mode determines how the text entered in the line edit is displayed (or echoed) to the user. <p>The most common setting is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }, in which the text entered by the user is displayed verbatim, but QLineEdit also supports modes that allow the entered text to be suppressed or obscured: these include {@link com.trolltech.qt.gui.QLineEdit.EchoMode NoEcho }, {@link com.trolltech.qt.gui.QLineEdit.EchoMode Password } and {@link com.trolltech.qt.gui.QLineEdit.EchoMode PasswordEchoOnEdit }. <p>The widget's display and the ability to copy or drag the text is affected by this setting. <p>By default, this property is set to {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit.EchoMode EchoMode }, and {@link com.trolltech.qt.gui.QLineEdit#displayText() displayText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="echoMode")
    @QtBlockedSlot
    public final void setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEchoMode_EchoMode(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setEchoMode_EchoMode(long __this__nativeId, int arg__1);

/**
This property holds whether the line edit draws itself with a frame. If enabled (the default) the line edit draws itself inside a frame, otherwise the line edit draws itself without any frame.
*/

    @com.trolltech.qt.QtPropertyWriter(name="frame")
    @QtBlockedSlot
    public final void setFrame(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrame_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFrame_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds The validation input mask. If no mask is set, {@link com.trolltech.qt.gui.QLineEdit#inputMask() inputMask()} returns an empty string. <p>Sets the QLineEdit's validation mask. Validators can be used instead of, or in conjunction with masks; see {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}. <p>Unset the mask and return to normal QLineEdit operation by passing an empty string ("") or just calling {@link com.trolltech.qt.gui.QLineEdit#setInputMask(java.lang.String) setInputMask()} with no arguments. <p>The table below shows the characters that can be used in an input mask. A space character, the default character for a blank, is needed for cases where a character is permitted but not required. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Character</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> <tt>A</tt></td><td> ASCII alphabetic character required. A-Z, a-z.</td></tr><tr valign="top" class="odd"><td> <tt>a</tt></td><td> ASCII alphabetic character permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>N</tt></td><td> ASCII alphanumeric character required. A-Z, a-z, 0-9.</td></tr><tr valign="top" class="odd"><td> <tt>n</tt></td><td> ASCII alphanumeric character permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>X</tt></td><td> Any character required.</td></tr><tr valign="top" class="odd"><td> <tt>x</tt></td><td> Any character permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>9</tt></td><td> ASCII digit required. 0-9.</td></tr><tr valign="top" class="odd"><td> <tt>0</tt></td><td> ASCII digit permitted but not required.</td></tr><tr valign="top" class="even"><td> <tt>D</tt></td><td> ASCII digit required. 1-9.</td></tr><tr valign="top" class="odd"><td> <tt>d</tt></td><td> ASCII digit permitted but not required (1-9).</td></tr><tr valign="top" class="even"><td> <tt>#</tt></td><td> ASCII digit or plus/minus sign permitted but not required.</td></tr><tr valign="top" class="odd"><td> <tt>H</tt></td><td> Hexadecimal character required. A-F, a-f, 0-9.</td></tr><tr valign="top" class="even"><td> <tt>h</tt></td><td> Hexadecimal character permitted but not required.</td></tr><tr valign="top" class="odd"><td> <tt>B</tt></td><td> Binary character required. 0-1.</td></tr><tr valign="top" class="even"><td> <tt>b</tt></td><td> Binary character permitted but not required.</td></tr><tr valign="top" class="odd"><td> <tt>&gt;</tt></td><td> All following alphabetic characters are uppercased.</td></tr><tr valign="top" class="even"><td> <tt>&lt;</tt></td><td> All following alphabetic characters are lowercased.</td></tr><tr valign="top" class="odd"><td> <tt>!</tt></td><td> Switch off case conversion.</td></tr><tr valign="top" class="even"><td> <tt>\</tt></td><td> Use <tt>\</tt> to escape the special characters listed above to use them as separators.</td></tr></table> The mask consists of a string of mask characters and separators, optionally followed by a semicolon and the character used for blanks. The blank characters are always removed from the text after editing. <p>Examples: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Mask</center></th><th><center> Notes</center></th></tr></thead><tr valign="top" class="even"><td> <tt>000.000.000.000;_</tt></td><td> IP address; blanks are <tt>_</tt>.</td></tr><tr valign="top" class="odd"><td> <tt>HH:HH:HH:HH:HH:HH;_</tt></td><td> MAC address</td></tr><tr valign="top" class="even"><td> <tt>0000-00-00</tt></td><td> ISO Date; blanks are <tt>space</tt></td></tr><tr valign="top" class="odd"><td> <tt>&gt;AAAAA-AAAAA-AAAAA-AAAAA-AAAAA;#</tt></td><td> License number; blanks are <tt>-</tt> and all (alphabetic) characters are converted to uppercase.</td></tr></table> To get range control (e.g., for an IP address) use masks together with {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) validators}. <p><DT><b>See also:</b><br><DD>{@link QLineEdit#maxLength() maxLength}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="inputMask")
    @QtBlockedSlot
    public final void setInputMask(java.lang.String inputMask)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInputMask_String(nativeId(), inputMask);
    }
    @QtBlockedSlot
    native void __qt_setInputMask_String(long __this__nativeId, java.lang.String inputMask);

/**
This property holds the maximum permitted length of the text. If the text is too long, it is truncated at the limit. <p>If truncation occurs any selected text will be unselected, the cursor position is set to 0 and the first part of the string is shown. <p>If the line edit has an input mask, the mask defines the maximum string length. <p>By default, this property contains a value of 32767. <p><DT><b>See also:</b><br><DD>{@link QLineEdit#inputMask() inputMask}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maxLength")
    @QtBlockedSlot
    public final void setMaxLength(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaxLength_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setMaxLength_int(long __this__nativeId, int arg__1);

/**
This property holds whether the line edit's contents has been modified by the user. The modified flag is never read by QLineEdit; it has a default value of false and is changed to true whenever the user changes the line edit's contents. <p>This is useful for things that need to provide a default value but do not start out knowing what the default should be (perhaps it depends on other fields on the form). Start the line edit without the best default, and when the default is known, if modified() returns false (the user hasn't entered any text), insert the default value. <p>Calling {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()} resets the modified flag to false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="modified")
    @QtBlockedSlot
    public final void setModified(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModified_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setModified_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the line edit is read only.  In read-only mode, the user can still copy the text to the clipboard, or drag and drop the text (if {@link com.trolltech.qt.gui.QLineEdit#echoMode() echoMode()} is {@link com.trolltech.qt.gui.QLineEdit.EchoMode Normal }), but cannot edit it. <p>QLineEdit does not show a cursor in read-only mode. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>setEnabled(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="readOnly")
    @QtBlockedSlot
    public final void setReadOnly(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadOnly_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setReadOnly_boolean(long __this__nativeId, boolean arg__1);

/**
Selects text from position <tt>start</tt> and for <tt>length</tt> characters. Negative lengths are allowed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#deselect() deselect()}, {@link com.trolltech.qt.gui.QLineEdit#selectAll() selectAll()}, and {@link com.trolltech.qt.gui.QLineEdit#selectedText() selectedText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelection(int arg__1, int arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelection_int_int(nativeId(), arg__1, arg__2);
    }
    @QtBlockedSlot
    native void __qt_setSelection_int_int(long __this__nativeId, int arg__1, int arg__2);

/**
This property holds the line edit's text. Setting this property clears the selection, clears the undo/redo history, moves the cursor to the end of the line and resets the {@link QLineEdit#isModified() modified} property to false. The text is not validated when inserted with {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}. <p>The text is truncated to {@link com.trolltech.qt.gui.QLineEdit#maxLength() maxLength()} length. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#insert(java.lang.String) insert()}, and {@link com.trolltech.qt.gui.QLineEdit#clear() clear()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="text")
    public final void setText(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), arg__1);
    }
    native void __qt_setText_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the margins around the text inside the frame to have the sizes <tt>left</tt>, <tt>top</tt>, <tt>right</tt>, and <tt>bottom</tt>. <p>See also {@link com.trolltech.qt.gui.QLineEdit#getTextMargins() getTextMargins()}.
*/

    @QtBlockedSlot
    public final void setTextMargins(int left, int top, int right, int bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextMargins_int_int_int_int(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_setTextMargins_int_int_int_int(long __this__nativeId, int left, int top, int right, int bottom);

/**
Sets this line edit to only accept input that the validator, <tt>v</tt>, will accept. This allows you to place any arbitrary constraints on the text which may be entered. <p>If <tt>v</tt> == 0, {@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) setValidator()} removes the current input validator. The initial setting is to have no input validator (i.e. any input is accepted up to {@link com.trolltech.qt.gui.QLineEdit#maxLength() maxLength()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#validator() validator()}, {@link com.trolltech.qt.gui.QIntValidator QIntValidator}, {@link com.trolltech.qt.gui.QDoubleValidator QDoubleValidator}, and {@link com.trolltech.qt.gui.QRegExpValidator QRegExpValidator}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValidator(com.trolltech.qt.gui.QValidator arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcValidator = arg__1;
        }
        __qt_setValidator_QValidator(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setValidator_QValidator(long __this__nativeId, long arg__1);

/**
This property holds the line edit's text. Setting this property clears the selection, clears the undo/redo history, moves the cursor to the end of the line and resets the {@link QLineEdit#isModified() modified} property to false. The text is not validated when inserted with {@link com.trolltech.qt.gui.QLineEdit#setText(java.lang.String) setText()}. <p>The text is truncated to {@link com.trolltech.qt.gui.QLineEdit#maxLength() maxLength()} length. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#insert(java.lang.String) insert()}, and {@link com.trolltech.qt.gui.QLineEdit#clear() clear()}. <br></DD></DT>
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
Undoes the last operation if undo is {@link QLineEdit#isUndoAvailable() available}. Deselects any current selection, and updates the selection start to the current cursor position.
*/

    public final void undo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    native void __qt_undo(long __this__nativeId);

/**
Returns a pointer to the current input validator, or 0 if no validator has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QValidator validator()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_validator(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QValidator __qt_validator(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

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
    protected void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMethodQuery_InputMethodQuery(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_inputMethodQuery_InputMethodQuery(long __this__nativeId, int arg__1);

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
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long arg__1);

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
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long arg__1);

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

    public static native QLineEdit fromNativePointer(QNativePointer nativePointer);

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

    protected QLineEdit(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
This is a overloaded function provided for convenience.
*/

    protected final void initStyleOption(QStyleOptionFrame option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END


    /**
    The TextMargins class represents the margins of
    the text in a QLineEdit.<p>It consists of four
    public integers, giving the top, bottom,
    left, and right margins.
     */
        public static final class TextMargins
    {
        /** The top margin of the QLineEdit. */
            public final int top;
        /** The bottom margin of the QLineEdit */
            public final int bottom;
        /** The left margin of the QLineEdit. */
            public final int left;
        /** The right margin of the QLineEdit. */
            public final int right;

        private TextMargins(int left, int top, int right, int bottom)
        {
            this.left = left;
            this.top = top;
            this.right = right;
            this.bottom = bottom;
        }
    }

    public final TextMargins getTextMargins()
    {
        QNativePointer left = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer top = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer right = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer bottom = new QNativePointer(QNativePointer.Type.Int);

        getTextMargins_private(left, top, right, bottom);

        return new TextMargins(left.intValue(), top.intValue(), right.intValue(),
            bottom.intValue());
    }

}
