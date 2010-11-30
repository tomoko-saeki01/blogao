package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QInputMethodEvent class provides parameters for input method events. Input method events are sent to widgets when an input method is used to enter text into a widget. Input methods are widely used to enter text for languages with non-Latin alphabets. <p>Note that when creating custom text editing widgets, the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_InputMethodEnabled } window attribute must be set explicitly (using the {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) QWidget::setAttribute()} function) in order to receive input method events. <p>The events are of interest to authors of keyboard entry widgets who want to be able to correctly handle languages with complex character input. Text input in such languages is usually a three step process: <ol><li> <b>Starting to Compose</b> <p>When the user presses the first key on a keyboard, an input context is created. This input context will contain a string of the typed characters.</li><li> <b>Composing</b> <p>With every new key pressed, the input method will try to create a matching string for the text typed so far called preedit string. While the input context is active, the user can only move the cursor inside the string belonging to this input context.</li><li> <b>Completing</b> <p>At some point, the user will activate a user interface component (perhaps using a particular key) where they can choose from a number of strings matching the text they have typed so far. The user can either confirm their choice cancel the input; in either case the input context will be closed.</li></ol> QInputMethodEvent models these three stages, and transfers the information needed to correctly render the intermediate result. A QInputMethodEvent has two main parameters: {@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()} and {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}. The {@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()} parameter gives the currently active preedit string. The {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()} parameter gives a text that should get added to (or replace parts of) the text of the editor widget. It usually is a result of the input operations and has to be inserted to the widgets text directly before the preedit string. <p>If the {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()} should replace parts of the of the text in the editor, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()} will contain the number of characters to be replaced. {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()} contains the position at which characters are to be replaced relative from the start of the preedit string. <p>A number of attributes control the visual appearance of the preedit string (the visual appearance of text outside the preedit string is controlled by the widget only). The {@link com.trolltech.qt.gui.QInputMethodEvent.AttributeType AttributeType } enum describes the different attributes that can be set. <p>A class implementing {@link com.trolltech.qt.gui.QWidget#inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent) QWidget::inputMethodEvent()} should at least understand and honor the {@link com.trolltech.qt.gui.QInputMethodEvent.AttributeType TextFormat } and {@link com.trolltech.qt.gui.QInputMethodEvent.AttributeType Cursor } attributes. <p>Since input methods need to be able to query certain properties from the widget, the widget must also implement {@link com.trolltech.qt.gui.QWidget#inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery) QWidget::inputMethodQuery()}. <p>When receiving an input method event, the text widget has to performs the following steps: <ol><li> If the widget has selected text, the selected text should get removed.</li><li> Remove the text starting at {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()} with length {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()} and replace it by the {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}. If {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()} is 0, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()} gives the insertion position for the {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}. <p>When doing replacement the area of the preedit string is ignored, thus a replacement starting at -1 with a length of 2 will remove the last character before the preedit string and the first character afterwards, and insert the commit string directly before the preedit string. <p>If the widget implements undo/redo, this operation gets added to the undo stack.</li><li> If there is no current preedit string, insert the {@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()} at the current cursor position; otherwise replace the previous preeditString with the one received from this event. <p>If the widget implements undo/redo, the {@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()} should not influence the undo/redo stack in any way. <p>The widget should examine the list of attributes to apply to the preedit string. It has to understand at least the {@link com.trolltech.qt.gui.QInputMethodEvent.AttributeType TextFormat } and Cursor attributes and render them as specified.</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContext QInputContext}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QInputMethodEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p><DT><b>See also.</b><br><DD>Attribute. <br></DD></DT>
*/

    public enum AttributeType implements com.trolltech.qt.QtEnumerator {
/**
 A {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} for the part of the preedit string specified by start and length. value contains a {@link com.trolltech.qt.QVariant QVariant} of type {@link com.trolltech.qt.gui.QTextFormat QTextFormat} specifying rendering of this part of the preedit string. There should be at most one format for every part of the preedit string. If several are specified for any character in the string the behaviour is undefined. A conforming implementation has to at least honor the backgroundColor, textColor and fontUnderline properties of the format.
*/

        TextFormat(0),
/**
 If set, a cursor should be shown inside the preedit string at position start. The length variable determines whether the cursor is visible or not. If the length is 0 the cursor is invisible. If value is a {@link com.trolltech.qt.QVariant QVariant} of type {@link com.trolltech.qt.gui.QColor QColor} this color will be used for rendering the cursor, otherwise the color of the surrounding text will be used. There should be at most one Cursor attribute per event. If several are specified the behaviour is undefined.
*/

        Cursor(1),
/**
 The variant contains a {@link com.trolltech.qt.core.QLocale QLocale} object specifying the language of a certain part of the preedit string. There should be at most one language set for every part of the preedit string. If several are specified for any character in the string the behaviour is undefined.
*/

        Language(2),
/**
 The ruby text for a part of the preedit string. There should be at most one ruby text set for every part of the preedit string. If several are specified for any character in the string the behaviour is undefined.
*/

        Ruby(3);

        AttributeType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QInputMethodEvent$AttributeType constant with the specified <tt>int</tt>.</brief>
*/

        public static AttributeType resolve(int value) {
            return (AttributeType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TextFormat;
            case 1: return Cursor;
            case 2: return Language;
            case 3: return Ruby;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an event of type {@link com.trolltech.qt.core.QEvent.Type QEvent::InputMethod }. The {@link com.trolltech.qt.gui.QInputMethodEvent#attributes() attributes()}, {@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()} are initialized to default values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#setCommitString(java.lang.String, int) setCommitString()}. <br></DD></DT>
*/

    public QInputMethodEvent(){
        super((QPrivateConstructor)null);
        __qt_QInputMethodEvent();
    }

    native void __qt_QInputMethodEvent();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QInputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent other){
        super((QPrivateConstructor)null);
        __qt_QInputMethodEvent_QInputMethodEvent(other == null ? 0 : other.nativeId());
    }

    native void __qt_QInputMethodEvent_QInputMethodEvent(long other);

/**
Construcs an event of type {@link com.trolltech.qt.core.QEvent.Type QEvent::InputMethod }. The preedit text is set to <tt>preeditText</tt>, the attributes to <tt>attributes</tt>. <p>The {@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()} values can be set using {@link com.trolltech.qt.gui.QInputMethodEvent#setCommitString(java.lang.String, int) setCommitString()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#attributes() attributes()}. <br></DD></DT>
*/

    public QInputMethodEvent(java.lang.String preeditText, java.util.List<com.trolltech.qt.gui.QInputMethodEvent_Attribute> attributes){
        super((QPrivateConstructor)null);
        __qt_QInputMethodEvent_String_List(preeditText, attributes);
    }

    native void __qt_QInputMethodEvent_String_List(java.lang.String preeditText, java.util.List<com.trolltech.qt.gui.QInputMethodEvent_Attribute> attributes);

/**
Returns the list of attributes passed to the QInputMethodEvent constructor. The attributes control the visual appearance of the preedit string (the visual appearance of text outside the preedit string is controlled by the widget only). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()}, and Attribute. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QInputMethodEvent_Attribute> attributes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QInputMethodEvent_Attribute> __qt_attributes(long __this__nativeId);

/**
Returns the text that should get added to (or replace parts of) the text of the editor widget. It usually is a result of the input operations and has to be inserted to the widgets text directly before the preedit string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#setCommitString(java.lang.String, int) setCommitString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#preeditString() preeditString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String commitString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_commitString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_commitString(long __this__nativeId);

/**
Returns the preedit text, i. . the text before the user started editing it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#attributes() attributes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String preeditString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preeditString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_preeditString(long __this__nativeId);

/**
Returns the number of characters to be replaced in the preedit string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#setCommitString(java.lang.String, int) setCommitString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int replacementLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replacementLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_replacementLength(long __this__nativeId);

/**
Returns the position at which characters are to be replaced relative from the start of the preedit string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#setCommitString(java.lang.String, int) setCommitString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int replacementStart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replacementStart(nativeId());
    }
    @QtBlockedSlot
    native int __qt_replacementStart(long __this__nativeId);


/**
Sets the commit string to <tt>commitString</tt>. <p>The commit string is the text that should get added to (or replace parts of) the text of the editor widget. It usually is a result of the input operations and has to be inserted to the widgets text directly before the preedit string. <p>If the commit string should replace parts of the of the text in the editor, <tt>replaceLength</tt> specifies the number of characters to be replaced. <tt>replaceFrom</tt> specifies the position at which characters are to be replaced relative from the start of the preedit string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCommitString(java.lang.String commitString, int replaceFrom) {
        setCommitString(commitString, replaceFrom, (int)0);
    }

/**
Sets the commit string to <tt>commitString</tt>. <p>The commit string is the text that should get added to (or replace parts of) the text of the editor widget. It usually is a result of the input operations and has to be inserted to the widgets text directly before the preedit string. <p>If the commit string should replace parts of the of the text in the editor, <tt>replaceLength</tt> specifies the number of characters to be replaced. <tt>replaceFrom</tt> specifies the position at which characters are to be replaced relative from the start of the preedit string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCommitString(java.lang.String commitString) {
        setCommitString(commitString, (int)0, (int)0);
    }
/**
Sets the commit string to <tt>commitString</tt>. <p>The commit string is the text that should get added to (or replace parts of) the text of the editor widget. It usually is a result of the input operations and has to be inserted to the widgets text directly before the preedit string. <p>If the commit string should replace parts of the of the text in the editor, <tt>replaceLength</tt> specifies the number of characters to be replaced. <tt>replaceFrom</tt> specifies the position at which characters are to be replaced relative from the start of the preedit string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent#commitString() commitString()}, {@link com.trolltech.qt.gui.QInputMethodEvent#replacementStart() replacementStart()}, and {@link com.trolltech.qt.gui.QInputMethodEvent#replacementLength() replacementLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCommitString(java.lang.String commitString, int replaceFrom, int replaceLength)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCommitString_String_int_int(nativeId(), commitString, replaceFrom, replaceLength);
    }
    @QtBlockedSlot
    native void __qt_setCommitString_String_int_int(long __this__nativeId, java.lang.String commitString, int replaceFrom, int replaceLength);

/**
@exclude
*/

    public static native QInputMethodEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QInputMethodEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QInputMethodEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
