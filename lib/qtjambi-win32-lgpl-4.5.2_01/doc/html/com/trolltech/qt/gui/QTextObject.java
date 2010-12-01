package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextObject class is a base class for different kinds of objects that can group parts of a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} together. The common grouping text objects are lists ({@link com.trolltech.qt.gui.QTextList QTextList}), frames ({@link com.trolltech.qt.gui.QTextFrame QTextFrame}), and tables ({@link com.trolltech.qt.gui.QTextTable QTextTable}). A text object has an associated {@link com.trolltech.qt.gui.QTextObject#format() format()} and {@link com.trolltech.qt.gui.QTextObject#document() document()}. <p>There are essentially two kinds of text objects: those that are used with blocks (block formats), and those that are used with characters (character formats). The first kind are derived from {@link com.trolltech.qt.gui.QTextBlockGroup QTextBlockGroup}, and the second kind from {@link com.trolltech.qt.gui.QTextFrame QTextFrame}. <p>You rarely need to use this class directly. When creating custom text objects, you will also need to reimplement {@link com.trolltech.qt.gui.QTextDocument#createObject(com.trolltech.qt.gui.QTextFormat) QTextDocument::createObject()} which acts as a factory method for creating text objects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextObject extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new QTextObject for the given <tt>document</tt>. <p><b>Warning:</b> This function should never be called directly, but only from {@link com.trolltech.qt.gui.QTextDocument#createObject(com.trolltech.qt.gui.QTextFormat) QTextDocument::createObject()}.
*/

    protected QTextObject(com.trolltech.qt.gui.QTextDocument doc){
        super((QPrivateConstructor)null);
        __qt_QTextObject_QTextDocument(doc == null ? 0 : doc.nativeId());
    }

    native void __qt_QTextObject_QTextDocument(long doc);

/**
Returns the document this object belongs to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextObject#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocument document()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_document(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextDocument __qt_document(long __this__nativeId);

/**
Returns the text object's format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextObject#setFormat(com.trolltech.qt.gui.QTextFormat) setFormat()}, and {@link com.trolltech.qt.gui.QTextObject#document() document()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFormat format()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFormat __qt_format(long __this__nativeId);

/**
Returns the index of the object's format in the document's internal list of formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#allFormats() QTextDocument::allFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int formatIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_formatIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_formatIndex(long __this__nativeId);

/**
Returns the object index of this object. This can be used together with {@link com.trolltech.qt.gui.QTextFormat#setObjectIndex(int) QTextFormat::setObjectIndex()}.
*/

    @QtBlockedSlot
    public final int objectIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_objectIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_objectIndex(long __this__nativeId);

/**
Sets the text object's <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextObject#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setFormat(com.trolltech.qt.gui.QTextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QTextFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QTextFormat(long __this__nativeId, long format);

/**
@exclude
*/

    public static native QTextObject fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextObject(QPrivateConstructor p) { super(p); } 
}
