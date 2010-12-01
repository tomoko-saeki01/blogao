package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextObjectInterface class allows drawing of custom text objects in {@link com.trolltech.qt.gui.QTextDocument QTextDocument}s. A text object describes the structure of one or more elements in a text document; for instance, images imported from HTML are implemented using text objects. A text object knows how to lay out and draw its elements when a document is being rendered. <p>Qt allows custom text objects to be inserted into a document by registering a custom {@link com.trolltech.qt.gui.QTextFormat#objectType() object type} with {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}. A QTextObjectInterface must also be implemented for this type and be {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#registerHandler(int, com.trolltech.qt.core.QObject) registered} with the {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout QAbstractTextDocumentLayout} of the document. When the object type is encountered while rendering a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}, the {@link com.trolltech.qt.gui.QTextObjectInterface#intrinsicSize(com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) intrinsicSize()} and {@link com.trolltech.qt.gui.QTextObjectInterface#drawObject(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) drawObject()} functions of the interface are called. <p>The following list explains the required steps of inserting a custom text object into a document: <ul><li> Choose an <tt>objectType</tt>. The <tt>objectType</tt> is an integer with a value greater or equal to {@link com.trolltech.qt.gui.QTextFormat.ObjectTypes QTextFormat::UserObject }.</li><li> Create a {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} object and set the object type to the chosen type using the setObjectType() function.</li><li> Implement the QTextObjectInterface class.</li><li> Call {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#registerHandler(int, com.trolltech.qt.core.QObject) QAbstractTextDocumentLayout::registerHandler()} with an instance of your QTextObjectInterface subclass to register your object type.</li><li> Insert {@link null.SpecialCharacter QChar::ObjectReplacementCharacter } with the aforementioned {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} of the chosen object type into the document. As mentioned, the functions of QTextObjectInterface{@link com.trolltech.qt.gui.QTextObjectInterface#intrinsicSize(com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) intrinsicSize()} and {@link com.trolltech.qt.gui.QTextObjectInterface#drawObject(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) drawObject()} will then be called with the {@link com.trolltech.qt.gui.QTextFormat QTextFormat} as parameter whenever the replacement character is encountered.</li></ul> A class implementing a text object needs to inherit both {@link com.trolltech.qt.core.QObject QObject} and QTextObjectInterface. {@link com.trolltech.qt.core.QObject QObject} must be the first class inherited. For instance: <pre class="snippet">
class SvgTextObject : public QObject, public QTextObjectInterface
{
    Q_OBJECT
    Q_INTERFACES(QTextObjectInterface)
</pre> The data of a text object is usually stored in the {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} using {@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) QTextCharFormat::setProperty()}, and then retrieved with {@link com.trolltech.qt.gui.QTextFormat#property(int) QTextCharFormat::property()}. <p><b>Warning:</b> Copy and Paste operations ignore custom text objects. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-textobject.html">Text Object Example</a>}, {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}, and {@link com.trolltech.qt.gui.QTextLayout QTextLayout}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QTextObjectInterface extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QTextObjectInterface {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void drawObject(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QTextDocument doc, int posInDocument, com.trolltech.qt.gui.QTextFormat format) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_drawObject_QPainter_QRectF_QTextDocument_int_QTextFormat(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), doc == null ? 0 : doc.nativeId(), posInDocument, format == null ? 0 : format.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QSizeF intrinsicSize(com.trolltech.qt.gui.QTextDocument doc, int posInDocument, com.trolltech.qt.gui.QTextFormat format) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_intrinsicSize_QTextDocument_int_QTextFormat(nativeId(), doc == null ? 0 : doc.nativeId(), posInDocument, format == null ? 0 : format.nativeId());
        }
    }


/**
This is an overloaded method provided for convenience.
*/

    public QTextObjectInterface(){
        super((QPrivateConstructor)null);
        __qt_QTextObjectInterface();
    }

    native void __qt_QTextObjectInterface();

/**
Draws this text object using the specified <tt>painter</tt>. <p>The size of the rectangle, <tt>rect</tt>, to draw in is the size previously calculated by {@link com.trolltech.qt.gui.QTextObjectInterface#intrinsicSize(com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) intrinsicSize()}. The rectangles position is relative to the <tt>painter</tt>. <p>You also get the document (<tt>doc</tt>) and the position (<tt>posInDocument</tt>) of the <tt>format</tt> in that document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextObjectInterface#intrinsicSize(com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) intrinsicSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void drawObject(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QTextDocument doc, int posInDocument, com.trolltech.qt.gui.QTextFormat format);
    @QtBlockedSlot
    native void __qt_drawObject_QPainter_QRectF_QTextDocument_int_QTextFormat(long __this__nativeId, long painter, long rect, long doc, int posInDocument, long format);

/**
The {@link com.trolltech.qt.gui.QTextObjectInterface#intrinsicSize(com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) intrinsicSize()} function returns the size of the text object represented by <tt>format</tt> in the given document (<tt>doc</tt>) at the given position (<tt>posInDocument</tt>). <p>The size calculated will be used for subsequent calls to {@link com.trolltech.qt.gui.QTextObjectInterface#drawObject(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) drawObject()} for this <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextObjectInterface#drawObject(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QTextDocument, int, com.trolltech.qt.gui.QTextFormat) drawObject()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QSizeF intrinsicSize(com.trolltech.qt.gui.QTextDocument doc, int posInDocument, com.trolltech.qt.gui.QTextFormat format);
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_intrinsicSize_QTextDocument_int_QTextFormat(long __this__nativeId, long doc, int posInDocument, long format);

/**
@exclude
*/

    public static native QTextObjectInterface fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextObjectInterface(QPrivateConstructor p) { super(p); } 
}
