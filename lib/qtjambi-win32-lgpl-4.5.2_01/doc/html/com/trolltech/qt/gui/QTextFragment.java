package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextFragment class holds a piece of text in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} with a single {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}. A text fragment describes a piece of text that is stored with a single character format. Text in which the character format changes can be represented by sequences of text fragments with different formats. <p>If the user edits the text in a fragment and introduces a different character format, the fragment's text will be split at each point where the format changes, and new fragments will be created. For example, changing the style of some text in the middle of a sentence will cause the fragment to be broken into three separate fragments: the first and third with the same format as before, and the second with the new style. The first fragment will contain the text from the beginning of the sentence, the second will contain the text from the middle, and the third takes the text from the end of the sentence. <br><center><img src="../images/qtextfragment-split.png"></center><br> A fragment's text and character format can be obtained with the {@link com.trolltech.qt.gui.QTextFragment#text() text()} and {@link com.trolltech.qt.gui.QTextFragment#charFormat() charFormat()} functions. The {@link com.trolltech.qt.gui.QTextFragment#length() length()} function gives the length of the text in the fragment. {@link com.trolltech.qt.gui.QTextFragment#position() position()} gives the position in the document of the start of the fragment. To determine whether the fragment contains a particular position within the document, use the {@link com.trolltech.qt.gui.QTextFragment#contains(int) contains()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument QTextDocument}, and {@link <a href="../richtext-structure.html">Rich Text Document Structure</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextFragment extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new empty text fragment.
*/

    public QTextFragment(){
        super((QPrivateConstructor)null);
        __qt_QTextFragment();
    }

    native void __qt_QTextFragment();

/**
Copies the content (text and format) of the <tt>other</tt> text fragment to this text fragment.
*/

    public QTextFragment(com.trolltech.qt.gui.QTextFragment o){
        super((QPrivateConstructor)null);
        __qt_QTextFragment_QTextFragment(o == null ? 0 : o.nativeId());
    }

    native void __qt_QTextFragment_QTextFragment(long o);

/**
Returns the text fragment's character format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFragment#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat charFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_charFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_charFormat(long __this__nativeId);

/**
Returns an index into the document's internal list of character formats for the text fragment's character format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#allFormats() QTextDocument::allFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int charFormatIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_charFormatIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_charFormatIndex(long __this__nativeId);

/**
Returns true if the text fragment contains the text at the given <tt>position</tt> in the document; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(int position)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_int(nativeId(), position);
    }
    @QtBlockedSlot
    native boolean __qt_contains_int(long __this__nativeId, int position);

/**
Returns true if this is a valid text fragment (i.e. has a valid position in a document); otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the number of characters in the text fragment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFragment#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.gui.QTextFragment o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QTextFragment(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QTextFragment(long __this__nativeId, long o);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QTextFragment o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextFragment(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextFragment(long __this__nativeId, long o);

/**
Returns the position of this text fragment in the document.
*/

    @QtBlockedSlot
    public final int position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_position(nativeId());
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
Returns the text fragment's as plain text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFragment#length() length()}, and {@link com.trolltech.qt.gui.QTextFragment#charFormat() charFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
@exclude
*/

    public static native QTextFragment fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextFragment(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextFragment array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextFragment)
        return operator_equal((com.trolltech.qt.gui.QTextFragment) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.gui.QTextFragment) {
            if (operator_less((com.trolltech.qt.gui.QTextFragment) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextFragment clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextFragment __qt_clone(long __this_nativeId);
}
