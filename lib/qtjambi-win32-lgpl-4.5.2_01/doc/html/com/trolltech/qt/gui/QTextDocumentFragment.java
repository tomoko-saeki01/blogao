package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextDocumentFragment class represents a piece of formatted text from a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A QTextDocumentFragment is a fragment of rich text, that can be inserted into a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A document fragment can be created from a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}, from a {@link com.trolltech.qt.gui.QTextCursor QTextCursor}'s selection, or from another document fragment. Document fragments can also be created by the static functions, {@link com.trolltech.qt.gui.QTextDocumentFragment#fromPlainText(java.lang.String) fromPlainText()} and {@link com.trolltech.qt.gui.QTextDocumentFragment#fromHtml(java.lang.String) fromHtml()}. <p>The contents of a document fragment can be obtained as plain text by using the {@link com.trolltech.qt.gui.QTextDocumentFragment#toPlainText() toPlainText()} function, or it can be obtained as HTML with {@link com.trolltech.qt.gui.QTextDocumentFragment#toHtml() toHtml()}.
*/
@QtJambiGeneratedClass
public class QTextDocumentFragment extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty QTextDocumentFragment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentFragment#isEmpty() isEmpty()}. <br></DD></DT>
*/

    public QTextDocumentFragment(){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentFragment();
    }

    native void __qt_QTextDocumentFragment();

/**
Creates a QTextDocumentFragment from the <tt>cursor</tt>'s selection. If the cursor doesn't have a selection, the created fragment is empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentFragment#isEmpty() isEmpty()}, and {@link com.trolltech.qt.gui.QTextCursor#selection() QTextCursor::selection()}. <br></DD></DT>
*/

    public QTextDocumentFragment(com.trolltech.qt.gui.QTextCursor range){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentFragment_QTextCursor(range == null ? 0 : range.nativeId());
    }

    native void __qt_QTextDocumentFragment_QTextCursor(long range);

/**
Converts the given <tt>document</tt> into a QTextDocumentFragment. Note that the QTextDocumentFragment only stores the document contents, not meta information like the document's title.
*/

    public QTextDocumentFragment(com.trolltech.qt.gui.QTextDocument document){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentFragment_QTextDocument(document == null ? 0 : document.nativeId());
    }

    native void __qt_QTextDocumentFragment_QTextDocument(long document);

/**
Copy constructor. Creates a copy of the <tt>other</tt> fragment.
*/

    public QTextDocumentFragment(com.trolltech.qt.gui.QTextDocumentFragment rhs){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentFragment_QTextDocumentFragment(rhs == null ? 0 : rhs.nativeId());
    }

    native void __qt_QTextDocumentFragment_QTextDocumentFragment(long rhs);

/**
Returns true if the fragment is empty; otherwise returns false.
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
Returns the contents of the document fragment as HTML, using the specified
encoding (e.g., "UTF-8", "ISO 8859-1").
*/

    @QtBlockedSlot
    public final java.lang.String toHtml()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toHtml(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toHtml(long __this__nativeId);

/**
Returns the contents of the document fragment as HTML, using the specified <tt>encoding</tt> (e. ., "UTF-8", "ISO 8859-1"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentFragment#toPlainText() toPlainText()}, {@link com.trolltech.qt.gui.QTextDocument#toHtml() QTextDocument::toHtml()}, and {@link com.trolltech.qt.core.QTextCodec QTextCodec}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toHtml(com.trolltech.qt.core.QByteArray encoding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toHtml_QByteArray(nativeId(), encoding == null ? 0 : encoding.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toHtml_QByteArray(long __this__nativeId, long encoding);

/**
Returns the document fragment's text as plain text (i. . with no formatting information). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentFragment#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toPlainText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPlainText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toPlainText(long __this__nativeId);

/**
Returns a QTextDocumentFragment based on the arbitrary piece of HTML in the given <tt>text</tt>. The formatting is preserved as much as possible; for example, "&lt;b&gt;bold&lt;/b&gt;" will become a document fragment with the text "bold" with a bold character format.
*/

    public native static com.trolltech.qt.gui.QTextDocumentFragment fromHtml(java.lang.String html);

/**
Returns a QTextDocumentFragment based on the arbitrary piece of HTML in the given <tt>text</tt>. The formatting is preserved as much as possible; for example, "&lt;b&gt;bold&lt;/b&gt;" will become a document fragment with the text "bold" with a bold character format. <p>If the provided HTML contains references to external resources such as imported style sheets, then they will be loaded through the <tt>resourceProvider</tt>.
*/

    public static com.trolltech.qt.gui.QTextDocumentFragment fromHtml(java.lang.String html, com.trolltech.qt.gui.QTextDocument resourceProvider)    {
        return __qt_fromHtml_String_QTextDocument(html, resourceProvider == null ? 0 : resourceProvider.nativeId());
    }
    native static com.trolltech.qt.gui.QTextDocumentFragment __qt_fromHtml_String_QTextDocument(java.lang.String html, long resourceProvider);

/**
Returns a document fragment that contains the given <tt>plainText</tt>. <p>When inserting such a fragment into a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} the current char format of the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} used for insertion is used as format for the text.
*/

    public native static com.trolltech.qt.gui.QTextDocumentFragment fromPlainText(java.lang.String plainText);

/**
@exclude
*/

    public static native QTextDocumentFragment fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextDocumentFragment(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextDocumentFragment array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextDocumentFragment clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextDocumentFragment __qt_clone(long __this_nativeId);
}
