package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlLocator class provides the XML handler classes with information about the parsing position within a file. The reader reports a QXmlLocator to the content handler before it starts to parse the document. This is done with the {@link com.trolltech.qt.xml.QXmlContentHandler#setDocumentLocator(com.trolltech.qt.xml.QXmlLocator) QXmlContentHandler::setDocumentLocator()} function. The handler classes can now use this locator to get the position ({@link com.trolltech.qt.xml.QXmlLocator#lineNumber() lineNumber()} and {@link com.trolltech.qt.xml.QXmlLocator#columnNumber() columnNumber()}) that the reader has reached.
*/
@QtJambiGeneratedClass
public abstract class QXmlLocator extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlLocator {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public int columnNumber() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnNumber(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int lineNumber() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_lineNumber(nativeId());
        }
    }


/**
Constructor.
*/

    public QXmlLocator(){
        super((QPrivateConstructor)null);
        __qt_QXmlLocator();
    }

    native void __qt_QXmlLocator();

/**
Returns the column number (starting at 1) or -1 if there is no column number available.
*/

    @QtBlockedSlot
    public abstract int columnNumber();
    @QtBlockedSlot
    native int __qt_columnNumber(long __this__nativeId);

/**
Returns the line number (starting at 1) or -1 if there is no line number available.
*/

    @QtBlockedSlot
    public abstract int lineNumber();
    @QtBlockedSlot
    native int __qt_lineNumber(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlLocator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlLocator(QPrivateConstructor p) { super(p); } 
}
